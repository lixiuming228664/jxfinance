package com.qf.jxfinance.pojo.vo;

/**
 * 用来封装查询用户的条件
 */
public class UserQuery {
    //会员名
    private String userName;
    //会员状态
    private int state;
    //会员等级
    private int level;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
