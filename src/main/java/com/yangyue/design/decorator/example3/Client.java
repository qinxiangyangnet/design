package com.yangyue.design.decorator.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 20:57
 **/
public class Client {
    public static void main(String[] args) {
        Componet c1 = new ConcreteComponent();
        MonthPrizeDecorqator m1 = new MonthPrizeDecorqator(c1);
        SumPrizeDecorator s1 = new SumPrizeDecorator(m1);
        //奖金加倍
        // SumPrizeDecorator s1 = new SumPrizeDecorator(s1);
        System.out.println(s1.calcPrize("詹三", null, null));
        System.out.println(s1.calcPrize("李四", null, null));
        GroupPrizeDecorator g1 = new GroupPrizeDecorator(s1);
        System.out.println(s1.calcPrize("王五", null, null));
    }
}
