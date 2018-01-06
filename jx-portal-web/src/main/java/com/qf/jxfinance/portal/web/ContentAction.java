package com.qf.jxfinance.portal.web;

import com.qf.jxfinance.common.util.PropKit;
import com.qf.jxfinance.pojo.po.Content;
import com.qf.jxfinance.service.ContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * User: Lenovo
 * Date: 2017/12/4
 * Time: 19:59
 * Version:V1.0
 */
@Controller
public class ContentAction {
   private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String listContentsByCid(Model model){
        try {

            //1 查询出结果
            System.out.println("告别404");
            Long cid = PropKit.use("ftp.properties").getLong("ftp.lunboId");
            //2 放入到model中
            List<Content> ad1List = contentService.listContentsByCid(cid);
            model.addAttribute("ad1List", ad1List);
            System.out.println(ad1List.size());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
        //3 返回

        return "index";
    }

}
