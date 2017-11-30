package com.qf.jxfinance.common.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装排序参数(限于Insurance模块)
 */
public class OrderForInsurance {
    private String sort;
    private String order;
    public List<String>  getOrderParams(){
        String [] sorts=this.sort.split(",");//排序列
        String [] orders=this.order.split(",");
        List<String> list=new ArrayList<String>();
        for(int i=0;i<sorts.length;i++){
            if("companyView".equals(sorts[i])){
                sorts[i]="company";
            }
            if("catView".equals(sorts[i])){
                sorts[i]="cat";
            }
            if("coverageView".equals(sorts[i])){
                sorts[i]="coverage";
            }
            if("premiumView".equals(sorts[i])){
                sorts[i]="premium";
            }
            if("stateView".equals(sorts[i])){
                sorts[i]="state";
            }
            if("stateView".equals(sorts[i])){
                sorts[i]="state";
            }
            if("telephoneView".equals(sorts[i])){
                sorts[i]="telephone";
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
