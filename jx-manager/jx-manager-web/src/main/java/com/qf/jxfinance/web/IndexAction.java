package com.qf.jxfinance.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Lenovo
 * Date: 2017/11/25
 * Time: 10:43
 * Version:V1.0
 */

    @Controller
    @Scope("prototype")
    public class IndexAction {
        @RequestMapping(value="/")
        public String index(){
            return "index";
        }
        @RequestMapping("/{page}")
        public String page(@PathVariable("page") String page){
            return page ;
        }


}
