package com.qf.jxfinance.pojo.po;

public class Fixedtime {
    private Long id;

    private Long comid;

    private Integer sevenEarnings;

    private Integer copies;

    private Integer periodCycle;

    private Integer initAmount;

    private Integer state;

    private String title;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getComid() {
        return comid;
    }

    public void setComid(Long comid) {
        this.comid = comid;
    }

    public Integer getSevenEarnings() {
        return sevenEarnings;
    }

    public void setSevenEarnings(Integer sevenEarnings) {
        this.sevenEarnings = sevenEarnings;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getPeriodCycle() {
        return periodCycle;
    }

    public void setPeriodCycle(Integer periodCycle) {
        this.periodCycle = periodCycle;
    }

    public Integer getInitAmount() {
        return initAmount;
    }

    public void setInitAmount(Integer initAmount) {
        this.initAmount = initAmount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}