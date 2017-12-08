package com.qf.jxfinance.portal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {

    @RequestMapping("/")
    public String index(){
        return  "index";
    }

    @RequestMapping("/{page}")
    public String pages(@PathVariable("page") String page){
        return page;
    }


}
