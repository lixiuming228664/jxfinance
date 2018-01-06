package com.qf.jxfinance.portal.web;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;
import com.qf.jxfinance.service.ContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ContentAction {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ContentService contentService;
    @RequestMapping("/")
    public String searchAll(Model model, @RequestParam(defaultValue = "1") Integer current,Page page, FixedtimeQuery query){
        page.setRows(8);
        page.setPage(current);
        try {
            Result<Fixedtime> result=contentService.searchAll(page,query);
            if(result!=null){
                List<Fixedtime> list=result.getRows();
                Long total=result.getTotal();
                model.addAttribute("page",page);
                model.addAttribute("list",list);
                model.addAttribute("total",total);
                System.out.println(page.getPage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(),e);
        }
        return "dqlc";
    }

}
