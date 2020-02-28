package com.yangyue.design.decorator.example3;

import java.util.Date;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 21:04
 **/
public class SumPrizeDecorator extends  Decorator {
    public SumPrizeDecorator(Componet componet) {
        super(componet);
    }

    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize=1000000*0.01;
        System.out.println(user+"累计奖金为： "+prize);
        return prize+money;
    }
}
