package com.qf.jxfinance.service.impl;

import com.qf.jxfinance.common.dto.OrderForInsurance;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.common.util.IDUtils;
import com.qf.jxfinance.dao.InsuranceProductCustomMapper;
import com.qf.jxfinance.dao.InsuranceProductMapper;
import com.qf.jxfinance.pojo.po.InsuranceProduct;
import com.qf.jxfinance.pojo.po.InsuranceProductExample;
import com.qf.jxfinance.pojo.vo.InsuranceProductCustom;
import com.qf.jxfinance.pojo.vo.InsuranceProductQuery;
import com.qf.jxfinance.service.InsuranceProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InsuranceProductServiceImpl implements InsuranceProductService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private InsuranceProductMapper ipDao;

	@Autowired
	private InsuranceProductCustomMapper ipcDao;

	@Transactional
	@Override
	public int save(InsuranceProduct insuranceProduct) {
		int result = 0;
		try {
			insuranceProduct.setId(IDUtils.getItemId());
			insuranceProduct.setState(1);
			result += ipDao.insertSelective(insuranceProduct);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<InsuranceProductCustom> listInsuranceProductsCustom(
			Page page, OrderForInsurance order, InsuranceProductQuery insuranceProductQuery) {

		Result<InsuranceProductCustom> result = null;

		if (page.getPage() <= 0 || page.getRows() <=0) {
			page.setPage(1);
			page.setRows(20);
		}
		try {
			//查询
			result = new Result<>();
			result.setTotal(ipcDao.countInsuranceProductsCustom(insuranceProductQuery));
			result.setRows(ipcDao.listInsuranceProductsCustom(page, order, insuranceProductQuery));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	@Transactional
	@Override
	public int deleteProducts(List<Long> ids) {
		int result = 0;
		try {
			//创建含有指定数据记录的对象
			InsuranceProduct record = new InsuranceProduct();
			record.setState(3);

			//添加"查询"条件模板
			InsuranceProductExample example = new InsuranceProductExample();
			InsuranceProductExample.Criteria criteria = example.createCriteria();
			//让其使用ids遍历
			criteria.andIdIn(ids);

			//执行更新操作
			result += ipDao.updateByExampleSelective(record, example);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}

	//上架和下架的操作
	@Transactional
	@Override
	public int updateProducts(List<Long> ids, int state) {
		int result = 0;
		try {
			if (state >= 1 && state <= 3) {
				//创建含有指定数据记录的对象
				InsuranceProduct record = new InsuranceProduct();
				record.setState(state);

				//添加"查询"条件模板
				InsuranceProductExample example = new InsuranceProductExample();
				InsuranceProductExample.Criteria criteria = example.createCriteria();
				//让其使用ids遍历
				criteria.andIdIn(ids);

				//执行更新操作
				result += ipDao.updateByExampleSelective(record, example);

			} else
				return 0;

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return result;
	}
}
