package com.qf.jxfinance.dao;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.pojo.vo.InsuranceProductCustom;
import com.qf.jxfinance.pojo.vo.InsuranceProductQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuranceProductCustomMapper {

	Long countInsuranceProductsCustom(@Param("insuranceProductQuery") InsuranceProductQuery insuranceProductQuery);

	List<InsuranceProductCustom> listInsuranceProductsCustom(@Param("page") Page page, @Param("order") OrderForInsurance order, @Param("insuranceProductQuery") InsuranceProductQuery insuranceProductQuery);

}
