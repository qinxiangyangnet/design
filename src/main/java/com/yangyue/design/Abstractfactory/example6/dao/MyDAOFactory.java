package com.yangyue.design.Abstractfactory.example6.dao;

import com.yangyue.design.Abstractfactory.example6.dao.dao.DAOFactory;
import com.yangyue.design.Abstractfactory.example6.dao.impl.RdbDAOFactory;
import com.yangyue.design.Abstractfactory.example6.dao.impl.XMLDAOFactory;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 11:03
 **/
public class MyDAOFactory {

    public  static DAOFactory  createDAOFactory(int  type){
        if(type==1){
            return new RdbDAOFactory();
        }else if(type==2){
            return  new XMLDAOFactory();
        }
        return null;
    }
}
