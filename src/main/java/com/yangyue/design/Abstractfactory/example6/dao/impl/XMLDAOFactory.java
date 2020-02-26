package com.yangyue.design.Abstractfactory.example6.dao.impl;

import com.yangyue.design.Abstractfactory.example6.dao.dao.DAOFactory;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:51
 **/
public class XMLDAOFactory implements DAOFactory {
    public OrderDetailDAO createOrderDetailDAO() {
        return new XMLDetailDAOImpl();
    }

    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }
}
