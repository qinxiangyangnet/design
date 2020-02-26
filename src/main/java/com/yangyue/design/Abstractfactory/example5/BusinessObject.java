package com.yangyue.design.Abstractfactory.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 10:53
 **/
public class BusinessObject {
    public static void main(String[] args) {
        //创建DAO的抽象工厂
        DAOFactory rdf = new RdbDAOFactory();
       // XMLDAOFactory xmldaoFactory = new XMLDAOFactory();
        OrderDetailDAO orderDetailDAO = rdf.createOrderDetailDAO();
        OrderMainDAO orderMainDAO = rdf.createOrderMainDAO();
        orderDetailDAO.saveOrderDetail();
        orderDetailDAO.saveOrderDetail();
    }
}
