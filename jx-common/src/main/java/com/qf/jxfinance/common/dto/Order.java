package com.qf.jxfinance.common.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装排序参数
 * User: Lenovo
 * Date: 2017/11/22
 * Time: 23:03
 * Version:V1.0
 */
public class Order {
    private String sort;
    private String order;
    public List<String>  getOrderParams(){
        String [] sorts=this.sort.split(",");//排序列
        String [] orders=this.order.split(",");
        List<String> list=new ArrayList<String>();
        for(int i=0;i<sorts.length;i++){
            if("priceView".equals(sorts[i])){
                sorts[i]="price";
            }
            if("statusName".equals(sorts[i])){
                sorts[i]="status";
            }
            String str=sorts[i]+" "+orders[i];
            list.add(str);
        }



        return list;
    }
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
