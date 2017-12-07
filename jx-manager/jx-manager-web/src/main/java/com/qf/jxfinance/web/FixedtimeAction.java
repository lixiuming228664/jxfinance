package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Fixedtime;
import com.qf.jxfinance.pojo.vo.FixedtimeQuery;
import com.qf.jxfinance.service.FixedtimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Scope("prototype")
public class FixedtimeAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FixedtimeService fixedtimeService;

    @ResponseBody
    @RequestMapping("/fixedtime")
    public Result<Fixedtime> listItemsByPageft(Page page, FixedtimeQuery query) {
        Result<Fixedtime> list = null;
        try {
            list = fixedtimeService.listItemsByPageft(page, query);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/itemft")
    public int addFixedtime(Fixedtime fixedtime) {
        int i = 0;
        try {
            i = fixedtimeService.saveFixtime(fixedtime);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/items/batch")
    public int updateBatch(@RequestParam("ids[]") List<Long> ids) {
        int i = 0;
        try {
            i = fixedtimeService.updateBatch(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/items/batchdown")
    public int downBatch(@RequestParam("ids[]") List<Long> ids) {
        int i = 0;
        try {
            i = fixedtimeService.downBatch(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/items/batchup")
    public int upBatch(@RequestParam("ids[]") List<Long> ids) {
        int i = 0;
        try {
            i = fixedtimeService.upBatch(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("ftfixtime")
    public String findById(@RequestParam("ftid") long ftid,Model model) {
        System.out.println(ftid+"66666");
        Fixedtime fixedtime = null;
        try {
            fixedtime = fixedtimeService.findById(ftid);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        model.addAttribute("fixedtime",fixedtime);
        return "fixedtime-edit";
    }
    @ResponseBody
    @RequestMapping("/itemupdate")
    public int updateFixedtime(Fixedtime fixedtime) {
        int i = 0;
        try {
            i = fixedtimeService.updateFixtime(fixedtime);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

}
