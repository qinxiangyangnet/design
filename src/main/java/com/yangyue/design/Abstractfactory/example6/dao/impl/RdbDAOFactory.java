package com.yangyue.design.Abstractfactory.example6.dao.impl;

import com.yangyue.design.Abstractfactory.example6.dao.dao.DAOFactory;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:52
 **/
public class RdbDAOFactory implements DAOFactory {
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }

    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }
}
