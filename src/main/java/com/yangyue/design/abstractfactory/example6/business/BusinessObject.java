package com.yangyue.design.abstractfactory.example6.business;

import com.yangyue.design.abstractfactory.example6.dao.MyDAOFactory;
import com.yangyue.design.abstractfactory.example6.dao.dao.DAOFactory;
import com.yangyue.design.abstractfactory.example6.dao.impl.OrderDetailDAO;
import com.yangyue.design.abstractfactory.example6.dao.impl.OrderMainDAO;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:53
 **/
public class BusinessObject {
    public static void main(String[] args) {
        //创建DAO的抽象工厂
        DAOFactory rdf = MyDAOFactory.createDAOFactory(1);
       // XMLDAOFactory xmldaoFactory = new XMLDAOFactory();
        OrderDetailDAO orderDetailDAO = rdf.createOrderDetailDAO();
        OrderMainDAO orderMainDAO = rdf.createOrderMainDAO();
        orderDetailDAO.saveOrderDetail();
        orderDetailDAO.saveOrderDetail();
    }
}
