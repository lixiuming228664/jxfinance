package com.qf.jxfinance.pojo.vo;

public class InsuranceProductQuery {
	private String name;

	private Integer state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "InsuranceProductQuery{" +
				"name='" + name + '\'' +
				", state=" + state +
				'}';
	}
}
