package com.qf.jxfinance.web;

import com.qf.jxfinance.common.dto.Order;
import com.qf.jxfinance.common.dto.Page;
import com.qf.jxfinance.common.dto.Result;
import com.qf.jxfinance.pojo.po.Current;
import com.qf.jxfinance.pojo.vo.CurrentCustom;
import com.qf.jxfinance.pojo.vo.CurrentQuery;
import com.qf.jxfinance.service.CurrentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/27
 * Time: 21:24
 * Version:V1.0
 */
@Controller
public class CurrentAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CurrentService currentService;

    /**
     * 分页查询
     * @param page
     * @param order
     * @param query
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/currents", method = RequestMethod.GET)
    public Result<CurrentCustom> listCurrents(Page page, Order order, CurrentQuery query) {
        Result<CurrentCustom> result = null;
        try {
            result = currentService.listCurrents(page, order, query);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量修改状态
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/currents/batch", method = RequestMethod.POST)
    public int itemsBatch(@RequestParam("ids[]") List<Long> ids) {
        int i = 0;
        try {
            i = currentService.currentsBatch(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 保存一个活期理财
     * @param current
     * @param content
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/current", method = RequestMethod.POST)
    public int saveItem(Current current, String content) {
        int i = 0;
        try {
            i = currentService.saveCurrent(current, content);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
    @ResponseBody
    @RequestMapping(value="/currents/putAwayCurrent",method = RequestMethod.POST)
    public int currentsPutAway(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = currentService.currentsPutAway(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
    @ResponseBody
    @RequestMapping(value="/currents/soldOutCurrent",method = RequestMethod.POST)
    public int currentsSoldOut(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = currentService.currentsSoldOut(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}