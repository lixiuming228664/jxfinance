package com.qf.jxfinance.common.dto;

public class MessageResponse {
    //响应吗 2表示成功
    private String code;
    //响应信息
    private String msg;
    //当提交成功后，此字段为流水号，否则为 0
    private String smsid;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSmsid() {
        return smsid;
    }

    public void setSmsid(String smsid) {
        this.smsid = smsid;
    }
}
