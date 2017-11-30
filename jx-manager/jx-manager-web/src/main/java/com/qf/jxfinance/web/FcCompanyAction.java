package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.FcCompany;
import com.qf.jxfinance.pojo.vo.FcCompanyQuery;
import com.qf.jxfinance.service.FcCompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@Scope("prototype")
public class FcCompanyAction {

        private Logger logger= LoggerFactory.getLogger(this.getClass());
        @Autowired
        private FcCompanyService fcCompanyService;
        @ResponseBody
        @RequestMapping("/fcCompany")
        public Result<FcCompany> listItemsByPagefc(Page page, FcCompanyQuery query) {
            Result<FcCompany> list = null;
            try {
                list = fcCompanyService.listItemsByPagefc(page,query);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                e.printStackTrace();
            }
            return list;
        }
        @ResponseBody
        @RequestMapping("/itemfc")
        public int addFcCompany(FcCompany fcCompany){
            int i=0;
            try {
                i=fcCompanyService.saveFcCompany(fcCompany);
            }catch(Exception e){
                logger.error(e.getMessage(),e);
                e.printStackTrace();
            }
            return i;
        }
        @ResponseBody
        @RequestMapping("/fccompany/batchfc")
        public int updateBatch(@RequestParam("ids[]") List<Long> ids){
            int i=0;
            try{
                i=fcCompanyService.updateBatch(ids);
            }catch(Exception e){
                logger.error(e.getMessage(),e);
                e.printStackTrace();
            }
            return i;
        }
        @ResponseBody
        @RequestMapping("/fccompany/batchdownfc")
        public int downBatch(@RequestParam("ids[]") List<Long> ids){
            int i=0;
            try{
                i=fcCompanyService.downBatch(ids);
            }catch(Exception e){
                logger.error(e.getMessage(),e);
                e.printStackTrace();
            }
            return i;
        }
        @ResponseBody
        @RequestMapping("/fccompany/batchupfc")
        public int upBatch(@RequestParam("ids[]") List<Long> ids){
            int i=0;
            try{
                i=fcCompanyService.upBatch(ids);
            }catch(Exception e){
                logger.error(e.getMessage(),e);
                e.printStackTrace();
            }
            return i;
        }

    }
