package com.yangyue.design.decorator.example3;

import com.yangyue.design.decorator.example2.TempDB;

import java.util.Date;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 21:03
 **/
public class MonthPrizeDecorqator extends Decorator {
    public MonthPrizeDecorqator(Componet componet) {
        super(componet);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize=TempDB.map.get(user)*0.03;
        System.out.println(user+"当月奖金为： "+prize);
        return prize+money;
    }
}
