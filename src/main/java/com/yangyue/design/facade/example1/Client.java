package com.yangyue.design.facade.example1;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 15:50
 **/
public class Client {

    public static void main(String[] args) {
        /**
         * 问题
         * 1，客户端对这些模块都要了解，才能够正确使用它们
         * 2，内部工具稍微有点变化，不知道通知客户端，比如内部方法加一个入参
         *
         *
         */
        new  Presentation().generate();
        new Buisiness().generate();
        new DAO().generate();
    }
}
