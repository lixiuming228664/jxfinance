package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.InsuranceCompany;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyCustom;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyQuery;
import com.qf.jxfinance.service.InsuranceCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InsuranceCompanyAction {
	@Autowired
	InsuranceCompanyService icService;

	@ResponseBody
	@RequestMapping(value = "/insurance/company", method = RequestMethod.POST)
	public int save(InsuranceCompany insuranceCompany) {
		return icService.save(insuranceCompany);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/companies", method = RequestMethod.GET)
	public Result<InsuranceCompanyCustom> listInsuranceProductsCustom(
			Page page, OrderForInsurance order, InsuranceCompanyQuery insuranceCompanyQuery) {

		return icService.listInsuranceCompaniesCustom(page, order, insuranceCompanyQuery);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/companies/delete", method = RequestMethod.POST)
	public int deleteCompanies(@RequestParam("ids[]") List<Long> ids) {
		return icService.deleteCompanies(ids);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/companies/update", method = RequestMethod.POST)
	public int updateCompanies(@RequestParam("ids[]") List<Long> ids, int state) {
		return icService.updateCompanies(ids, state);
	}


}
