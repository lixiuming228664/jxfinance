package com.qf.jxfinance.common.util;

import com.qf.jxfinance.common.dto.MessageResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {

    @Test
    public void testSendckCode() throws Exception {

        int ckCode = (int) ((Math.random() * 9 + 1) * 100000);
        System.out.println("验证码是：" + ckCode);

        MessageResponse messageResponse = MessageUtil.sendckCode(""+ckCode, "18895681019");
        String code = messageResponse.getCode();
        String msg = messageResponse.getMsg();
        String smsid = messageResponse.getSmsid();

        System.out.println(code);
        System.out.println(msg);
        System.out.println(smsid);

    }


}