package com.yangyue.design.decorator.example2;

import java.util.Date;

/**
 * @program: design
 * @description: 计算奖金的对象
 * @author: yueyang
 * @create: 2020-02-28 20:18
 **/
public class Prize {

    public  double calcPrize(String user, Date begin,Date end){
        double prize=0.0;
        //当月业务奖金
        prize=this.monthPrize(user,begin,end);
        //累计奖金
        prize +=this.sumPrize(user,begin,end);
        //判断是否是管理人员
        if(this.isManager(user)){
            //团队的奖金
            prize +=  this.groupPrize(user,begin,end);
        }
        return prize;
    }

    private   double   monthPrize(String user, Date begin,Date end){
        double prize=TempDB.map.get(user)*0.03;
        System.out.println(user+"当月奖金为： "+prize);
        return prize;

    }

    private   double   sumPrize(String user, Date begin,Date end){
        double prize=1000000*0.01;
        System.out.println(user+"累计奖金为： "+prize);
        return prize;
    }
    private   boolean   isManager(String user){
        if(user.equals("王五")) return true;
        return false;
    }
    private   double   groupPrize(String user, Date begin,Date end){
        double group=0.0;
        for(double d:TempDB.map.values()){
            group +=d;
        }
        double prize=group*0.01;
        System.out.println(user+"当月团队的业务奖金为： "+prize);
        return prize;
    }


}
