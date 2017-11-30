package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.InsuranceCompany;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyCustom;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyQuery;

import java.util.List;

public interface InsuranceCompanyService {

	int save(InsuranceCompany insuranceCompany);

	Result<InsuranceCompanyCustom> listInsuranceCompaniesCustom(Page page, OrderForInsurance order, InsuranceCompanyQuery insuranceCompanyQuery);

	int deleteCompanies(List<Long> ids);

	int updateCompanies(List<Long> ids, int state);
}
