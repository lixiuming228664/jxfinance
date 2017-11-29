package com.qf.jxfinance.pojo.po;

public class Loan {
    private Integer id;
    private Integer loanTime;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private Boolean repayment;//还款方式

    private Double interestRate;//利率

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Integer loanTime) {
        this.loanTime = loanTime;
    }

    public Boolean getRepayment() {
        return repayment;
    }

    public void setRepayment(Boolean repayment) {
        this.repayment = repayment;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}