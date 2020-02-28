package com.yangyue.design.decorator.example3;

import java.util.Date;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 20:59
 **/
public  abstract class Decorator extends Componet  {

    private Componet  componet=null;
    public  Decorator  (Componet  componet){
        this.componet=componet;
    }

    public double calcPrize(String user, Date begin, Date end) {
        return componet.calcPrize(user,begin,end);
    }

}
