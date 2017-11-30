package com.qf.jxfinance.pojo.vo;

import com.qf.jxfinance.pojo.po.InsuranceProduct;

public class InsuranceProductCustom extends InsuranceProduct {
	private String companyView;

	private String catView;

	private String coverageView;

	private String premiumView;

	private String stateView;

	public String getCompanyView() {
		return companyView;
	}

	public void setCompanyView(String companyView) {
		this.companyView = companyView;
	}

	public String getCatView() {
		return catView;
	}

	public void setCatView(String catView) {
		this.catView = catView;
	}

	public String getCoverageView() {
		return coverageView;
	}

	public void setCoverageView(String coverageView) {
		this.coverageView = coverageView;
	}

	public String getPremiumView() {
		return premiumView;
	}

	public void setPremiumView(String premiumView) {
		this.premiumView = premiumView;
	}

	public String getStateView() {
		return stateView;
	}

	public void setStateView(String stateView) {
		this.stateView = stateView;
	}

	@Override
	public String toString() {
		return "InsuranceProductCustom{" +
				"companyView='" + companyView + '\'' +
				", catView='" + catView + '\'' +
				", coverageView='" + coverageView + '\'' +
				", premiumView='" + premiumView + '\'' +
				", stateView='" + stateView + '\'' +
				'}';
	}
}
