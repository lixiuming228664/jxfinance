package com.qf.jxfinance.sso.web;

import com.qf.jxfinance.common.dto.MessageResult;
import com.qf.jxfinance.common.util.CookieUtils;
import com.qf.jxfinance.common.util.ImageCodeUtils;
import com.qf.jxfinance.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


@Controller
public class SSOIndexAction {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "login";
    }


    /**
     * 获取验证码
     */
    @ResponseBody
    @RequestMapping("/user/checkCode")
    public void createCkCode(HttpServletRequest request, HttpServletResponse response){
        try {
            ImageCodeUtils.createImageCode(request,response);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public MessageResult login(String username, String password, String ckCode, HttpServletRequest request, HttpServletResponse response){
        MessageResult mr = null;
        try {
            //拿到session中的验证码
            String genCKCode = (String) request.getSession().getAttribute("checkcode_session");
            if(!genCKCode.equals(ckCode)){
                mr.setSuccess(false);
                mr.setMessage("验证码错误！");
                return mr;
            }

            //调用业务逻辑层登录
            mr = userService.userLogin(username,password);

            //登录成功 - 把令牌存入cookie中
            if(mr.isSuccess()){
                String token = (String) mr.getData();
                CookieUtils.setCookie(request,response,"tt_token",token);
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
        return mr;
    }

}