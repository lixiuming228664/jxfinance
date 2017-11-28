package com.qf.jxfinance.common.dto;

/**
 * User: Lenovo
 * Date: 2017/11/21
 * Time: 14:18
 * Version:V1.0
 */
public class Page {
    //当前页
    private int page;
    //每页显示的条数
    private int rows;
    //还要写下偏移量，就是数据库检索时limit 的两个数字

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getOffset(){
        return (page-1)*rows;
    }
}
