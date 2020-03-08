package com.yangyue.design.proxy.examle4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-08 14:39
 **/
public class Client {
    public static void main(String[] args)throws Exception {
        BaseService mike = ProxyFactory.build(Person.class);
        mike.eat();
    }
}
