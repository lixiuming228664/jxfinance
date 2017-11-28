package com.qf.jxfinance.pojo.po;

import java.util.Date;

public class Current {
    private Long id;

    private Long fcId;

    private Integer risk;

    private Integer nav;

    private Integer threeRate;

    private Integer redempTime;

    private Integer nearYear;

    private Integer initAmount;

    private Date setTime;

    private String newScale;

    private String title;

    private Integer state;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFcId() {
        return fcId;
    }

    public void setFcId(Long fcId) {
        this.fcId = fcId;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public Integer getNav() {
        return nav;
    }

    public void setNav(Integer nav) {
        this.nav = nav;
    }

    public Integer getThreeRate() {
        return threeRate;
    }

    public void setThreeRate(Integer threeRate) {
        this.threeRate = threeRate;
    }

    public Integer getRedempTime() {
        return redempTime;
    }

    public void setRedempTime(Integer redempTime) {
        this.redempTime = redempTime;
    }

    public Integer getNearYear() {
        return nearYear;
    }

    public void setNearYear(Integer nearYear) {
        this.nearYear = nearYear;
    }

    public Integer getInitAmount() {
        return initAmount;
    }

    public void setInitAmount(Integer initAmount) {
        this.initAmount = initAmount;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getNewScale() {
        return newScale;
    }

    public void setNewScale(String newScale) {
        this.newScale = newScale == null ? null : newScale.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}