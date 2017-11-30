package com.qf.jxfinance.pojo.vo;

import com.qf.jxfinance.pojo.po.InsuranceCompany;

public class InsuranceCompanyCustom extends InsuranceCompany{
	private String telephoneView;

	private String stateView;

	public String getTelephoneView() {
		return telephoneView;
	}

	public void setTelephoneView(String telephoneView) {
		this.telephoneView = telephoneView;
	}

	public String getStateView() {
		return stateView;
	}

	public void setStateView(String stateView) {
		this.stateView = stateView;
	}

	@Override
	public String toString() {
		return "InsuranceCompanyCustom{" +
				"telephoneView='" + telephoneView + '\'' +
				", stateView='" + stateView + '\'' +
				'}';
	}
}
