package com.yangyue.design.decorator.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 20:17
 **/
public class Client {
    public static void main(String[] args) {

        Prize prize = new Prize();
        System.out.println(prize.calcPrize("詹三",null,null));
        System.out.println(prize.calcPrize("李四",null,null));
        System.out.println(prize.calcPrize("王五",null,null));
    }
}
