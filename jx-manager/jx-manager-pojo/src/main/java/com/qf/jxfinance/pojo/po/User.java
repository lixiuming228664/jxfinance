package com.qf.jxfinance.pojo.po;

import java.util.Date;

public class User {
    private Long id;

    private String userName;

    private String userRealname;

    private String loginPassword;

    private String payPassword;

    private String email;

    private Integer phone;

    private String address;
    //身份证号
    private String idCard;
    //银行卡号1
    private String bankCard1;
    //银行卡号1
    private String bankCard2;

    private String image;
    // 1.管理员 2.普通用户 3.vip
    private Integer level;
    //1.正常 2.禁用 3.删除
    private Integer state;

    private Date created;

    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getBankCard1() {
        return bankCard1;
    }

    public void setBankCard1(String bankCard1) {
        this.bankCard1 = bankCard1 == null ? null : bankCard1.trim();
    }

    public String getBankCard2() {
        return bankCard2;
    }

    public void setBankCard2(String bankCard2) {
        this.bankCard2 = bankCard2 == null ? null : bankCard2.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}