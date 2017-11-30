package com.qf.jxfinance.dao;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyCustom;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuranceCompanyCustomMapper {

	Long countInsuranceCompaniesCustom(@Param("insuranceCompanyQuery") InsuranceCompanyQuery insuranceCompanyQuery);

	List<InsuranceCompanyCustom> listInsuranceCompaniesCustom(@Param("page") Page page, @Param("order") OrderForInsurance order, @Param("insuranceCompanyQuery") InsuranceCompanyQuery insuranceCompanyQuery);

}
