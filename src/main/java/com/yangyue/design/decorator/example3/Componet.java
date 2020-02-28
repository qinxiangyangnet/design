package com.yangyue.design.decorator.example3;

import java.util.Date;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 20:57
 **/
public abstract class Componet {

    public  abstract  double calcPrize(String user, Date begin,Date end);
}
