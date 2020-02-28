package com.yangyue.design.decorator.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 00:08
 **/
public class LogDecorater extends Decorator {
    public LogDecorater(Component component) {
        super(component);
    }

    public boolean sale(String user, String customer, SaleModel saleModel) {
        this.sale(user,customer,saleModel);
        System.out.println(user+""+customer+saleModel.getSaleName()+saleModel.getSaleNum());
        return true;
    }
}
