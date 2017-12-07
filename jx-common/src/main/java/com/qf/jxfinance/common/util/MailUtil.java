package com.qf.jxfinance.common.util;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 邮件工具类
 */
public class MailUtil {
    /**
     * 使用加密的方式,利用465端口进行传输邮件,开启ssl
     *
     * @param to      为收件人邮箱
     * @param subject 邮件主题
     * @param message 发送的消息
     */
    public static void sendEmil(String to, String subject, String message) {
        try {
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            //设置邮件会话参数
            Properties props = new Properties();
            //邮箱的发送服务器地址
            props.setProperty("mail.smtp.host", "smtp.qq.com");
            props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            //邮箱发送服务器端口,这里设置为465端口
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.auth", "true");
            final String username = "xiangmingdu@foxmail.com";
            final String password = "htljovsiiahacjgb";
            //获取到邮箱会话,利用匿名内部类的方式,将发送者邮箱用户名和密码授权给jvm
            Session session = Session.getDefaultInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            //通过会话,得到一个邮件,用于发送
            Message msg = new MimeMessage(session);
            String nick = "";
            nick = javax.mail.internet.MimeUtility.encodeText("【金溪金融】");

            //设置发件人
            msg.setFrom(new InternetAddress(nick + "<" + "xiangmingdu@foxmail.com" + ">"));
            //设置收件人,to为收件人,cc为抄送,bcc为密送
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(to, false));
            msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to, false));
            //设置邮件主题
            msg.setSubject(subject);
            //设置邮件消息
            msg.setText(message);
            //设置发送的日期
            msg.setSentDate(new Date());
            //调用Transport的send方法去发送邮件
            Transport.send(msg);

        } catch (Exception e) {
            throw new RuntimeException("邮件发送失败！", e);
        }
    }


    /**
     * 发送验证码
     *
     * @return
     */
    public static boolean sendRegisterCode(String toEmail, String ckcode) {
        boolean result = true;

        String subject = "【金溪金融】 注册验证码";
        String message = "尊敬的客户，您本次的验证码是：" + ckcode + "。请不要把验证码泄露给其他人。注意：工作人员不会向您索要验证码！";
        try {
            sendEmil(toEmail, subject, message);
        } catch (Exception e) {
            result = false;
            //处理异常
            e.printStackTrace();
        }
        return result;
    }


}
