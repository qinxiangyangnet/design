package com.yangyue.design.decorator.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 00:05
 **/
public class ConcreteComponent implements  Component {
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println("用户"+customer+"买了"+saleModel.getSaleName()+"数量为："+saleModel.getSaleNum());
        return true;
    }
}
