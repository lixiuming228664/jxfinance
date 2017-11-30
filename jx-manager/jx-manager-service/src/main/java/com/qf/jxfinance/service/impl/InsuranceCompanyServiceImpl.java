package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.InsuranceCompanyCustomMapper;
import com.qf.jxfinance.dao.InsuranceCompanyMapper;
import com.qf.jxfinance.pojo.po.InsuranceCompany;
import com.qf.jxfinance.pojo.po.InsuranceCompanyExample;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyCustom;
import com.qf.jxfinance.pojo.vo.InsuranceCompanyQuery;
import com.qf.jxfinance.service.InsuranceCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InsuranceCompanyServiceImpl implements InsuranceCompanyService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private InsuranceCompanyMapper icDao;

	@Autowired
	private InsuranceCompanyCustomMapper iccDao;

	@Transactional
	@Override
	public int save(InsuranceCompany insuranceCompany) {
		int result = 0;
		try {
			insuranceCompany.setId(IDUtils.getItemId());
			insuranceCompany.setState(1);
			result += icDao.insertSelective(insuranceCompany);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<InsuranceCompanyCustom> listInsuranceCompaniesCustom(
			Page page, OrderForInsurance order, InsuranceCompanyQuery insuranceCompanyQuery) {

		Result<InsuranceCompanyCustom> result = null;

		if (page.getPage() <= 0 || page.getRows() <=0) {
			page.setPage(1);
			page.setRows(20);
		}
		try {
			//查询
			result = new Result<>();
			result.setTotal(iccDao.countInsuranceCompaniesCustom(insuranceCompanyQuery));
			result.setRows(iccDao.listInsuranceCompaniesCustom(page, order, insuranceCompanyQuery));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteCompanies(List<Long> ids) {
		int result = 0;
		try {
			//创建含有指定数据记录的对象
			InsuranceCompany record = new InsuranceCompany();
			record.setState(3);

			//添加"查询"条件模板
			InsuranceCompanyExample example = new InsuranceCompanyExample();
			InsuranceCompanyExample.Criteria criteria = example.createCriteria();
			//让其使用ids遍历
			criteria.andIdIn(ids);

			//执行更新操作
			result += icDao.updateByExampleSelective(record, example);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateCompanies(List<Long> ids, int state) {
		int result = 0;
		try {
			if (state >= 1 && state <= 3) {
				//创建含有指定数据记录的对象
				InsuranceCompany record = new InsuranceCompany();
				record.setState(state);

				//添加"查询"条件模板
				InsuranceCompanyExample example = new InsuranceCompanyExample();
				InsuranceCompanyExample.Criteria criteria = example.createCriteria();
				//让其使用ids遍历
				criteria.andIdIn(ids);

				//执行更新操作
				result += icDao.updateByExampleSelective(record, example);

			} else
				return 0;

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}
}
