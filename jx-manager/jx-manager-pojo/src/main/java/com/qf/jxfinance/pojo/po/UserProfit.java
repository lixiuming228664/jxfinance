package com.qf.jxfinance.pojo.po;

public class UserProfit {
    private Long id;

    private Integer todayTermDepositsProfit;

    private Integer todayFundProfit;

    private Integer totalProfit;

    private Integer userid;

    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTodayTermDepositsProfit() {
        return todayTermDepositsProfit;
    }

    public void setTodayTermDepositsProfit(Integer todayTermDepositsProfit) {
        this.todayTermDepositsProfit = todayTermDepositsProfit;
    }

    public Integer getTodayFundProfit() {
        return todayFundProfit;
    }

    public void setTodayFundProfit(Integer todayFundProfit) {
        this.todayFundProfit = todayFundProfit;
    }

    public Integer getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Integer totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}