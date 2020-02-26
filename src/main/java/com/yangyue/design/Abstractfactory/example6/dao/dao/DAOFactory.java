package com.yangyue.design.Abstractfactory.example6.dao.dao;

import com.yangyue.design.Abstractfactory.example6.dao.impl.OrderDetailDAO;
import com.yangyue.design.Abstractfactory.example6.dao.impl.OrderMainDAO;

/**
 * @program: design
 * @description:抽象工厂，创建订单主，子记
 * @author: yueyang
 * @create: 2020-02-26 10:49
 **/
public interface  DAOFactory {

    public  OrderDetailDAO createOrderDetailDAO();
    public  OrderMainDAO createOrderMainDAO();
}
