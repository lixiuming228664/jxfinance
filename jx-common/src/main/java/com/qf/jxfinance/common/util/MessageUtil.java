package com.qf.jxfinance.common.util;

import com.qf.jxfinance.common.dto.MessageResponse;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;

public class MessageUtil {

    /**
     * 发送手机验证码
     *
     * @param ckCode
     * @return
     */
    public static MessageResponse sendckCode(String ckCode, String phoneNumber) {

        MessageResponse messageResponse = new MessageResponse();

        String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("GBK");
        method.setRequestHeader("ContentType", "application/x-www-form-urlencoded;charset=GBK");

        String content = new String("您的验证码是：" + ckCode + "。请不要把验证码泄露给其他人。");

        NameValuePair[] data = {//提交短信
                new NameValuePair("account", "C29578675"),
                //查看用户名是登录用户中心->验证码短信->产品总览->APIID
                new NameValuePair("password", "1bd6f6005e7c8b6bae773f5a4e8d54c4"),
                //查看密码请登录用户中心->验证码短信->产品总览->APIKEY
                //new NameValuePair("password", StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile", phoneNumber),
                new NameValuePair("content", content),
        };

        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult = method.getResponseBodyAsString();

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            messageResponse.setCode(root.elementText("code"));
            messageResponse.setMsg(root.elementText("msg"));
            messageResponse.setSmsid(root.elementText("smsid"));

            return messageResponse;

        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
