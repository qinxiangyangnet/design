package com.yangyue.design.abstractfactory.example5;

/**
 * @program: design
 * @description:抽象工厂，创建订单主，子记
 * @author: yueyang
 * @create: 2020-02-26 10:49
 **/
public abstract class DAOFactory {

    public abstract  OrderDetailDAO  createOrderDetailDAO();
    public abstract  OrderMainDAO  createOrderMainDAO();
}
