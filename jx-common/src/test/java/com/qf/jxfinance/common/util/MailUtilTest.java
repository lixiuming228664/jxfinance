package com.qf.jxfinance.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MailUtilTest {

    /**
     * 测试使用邮件发送验证码
     */
    public void TestSendRegisterCode() {

        int ckCode = (int) ((Math.random() * 9 + 1) * 100000);
        System.out.println("验证码是：" + ckCode);
        MailUtil.sendRegisterCode("xiangmingdu@126.com", "" + ckCode);
        System.out.println("恭喜，发送成功！");

    }



}