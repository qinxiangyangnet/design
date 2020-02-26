package com.yangyue.design.Abstractfactory.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:51
 **/
public class XMLDAOFactory extends DAOFactory {
    public OrderDetailDAO createOrderDetailDAO() {
        return new XMLDetailDAOImpl();
    }

    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }
}
