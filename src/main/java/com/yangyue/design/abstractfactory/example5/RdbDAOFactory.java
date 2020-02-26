package com.yangyue.design.abstractfactory.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:52
 **/
public class RdbDAOFactory extends DAOFactory {
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }

    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }
}
