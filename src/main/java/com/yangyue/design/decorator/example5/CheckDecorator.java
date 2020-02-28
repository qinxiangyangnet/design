package com.yangyue.design.decorator.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 00:13
 **/
public class CheckDecorator extends Decorator {
    public CheckDecorator(Component component) {
        super(component);
    }

    public boolean sale(String user, String customer, SaleModel saleModel) {
        //控制权限的功能
        return false;
    }
}
