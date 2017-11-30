package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.InsuranceProduct;
import com.qf.jxfinance.pojo.vo.InsuranceProductCustom;
import com.qf.jxfinance.pojo.vo.InsuranceProductQuery;
import com.qf.jxfinance.service.InsuranceProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InsuranceProductAction {
	@Autowired
	InsuranceProductService ipService;

	@ResponseBody
	@RequestMapping(value = "/insurance/products", method = RequestMethod.GET)
	public Result<InsuranceProductCustom> listInsuranceProductsCustom(
			Page page, OrderForInsurance order, InsuranceProductQuery insuranceProductQuery) {

		return ipService.listInsuranceProductsCustom(page, order, insuranceProductQuery);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/product", method = RequestMethod.POST)
	public int save(InsuranceProduct insuranceProduct) {
		return ipService.save(insuranceProduct);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/products/delete", method = RequestMethod.POST)
	public int deleteProducts(@RequestParam("ids[]") List<Long> ids) {
		return ipService.deleteProducts(ids);
	}

	@ResponseBody
	@RequestMapping(value = "/insurance/products/update", method = RequestMethod.POST)
	public int updateProducts(@RequestParam("ids[]") List<Long> ids, int state) {
		return ipService.updateProducts(ids, state);
	}


}
