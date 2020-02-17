package com.yangyue.design.facade.example2;

/**
 * @program: design
 * @description:外观对象
 * @author: yueyang
 * @create: 2020-02-17 15:21
 **/
public class Facade {

    /**
     * 示意方法，满足客户需要的功能
     */
    public void test() {

        AModuleApi a = new AModuleApiImpl();
        a.testA();
        BModuleApi b = new BModuleApiImpl();
        b.testB();
        CModuleApi c = new CModuleApiImpl();
        c.testC();
    }
}
