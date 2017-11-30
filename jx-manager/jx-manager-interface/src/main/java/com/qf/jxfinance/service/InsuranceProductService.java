package com.qf.jxfinance.service;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.InsuranceProduct;
import com.qf.jxfinance.pojo.vo.InsuranceProductCustom;
import com.qf.jxfinance.pojo.vo.InsuranceProductQuery;

import java.util.List;

public interface InsuranceProductService {

	int save(InsuranceProduct insuranceProduct);

	Result<InsuranceProductCustom> listInsuranceProductsCustom(Page page, OrderForInsurance order, InsuranceProductQuery insuranceProductQuery);

	int deleteProducts(List<Long> ids);

	int updateProducts(List<Long> ids, int state);
}
