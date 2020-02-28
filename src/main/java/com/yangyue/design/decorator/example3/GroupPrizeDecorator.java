package com.yangyue.design.decorator.example3;

import com.yangyue.design.decorator.example2.TempDB;

import java.util.Date;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 21:05
 **/
public class GroupPrizeDecorator  extends Decorator {
    public GroupPrizeDecorator(Componet componet) {
        super(componet);
    }

    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double group=0.0;
        for(double d:TempDB.map.values()){
            group +=d;
        }
        double prize=group*0.01;
        System.out.println(user+"当月团队的业务奖金为： "+prize);
        return prize+money;
    }
}
