package com.yangyue.design.strategy;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 13:30:23
 */
public class Client {

    public static void main(String[] args) {


        Context context = new Context(new Harreier());
        context.handler();
    }
}
