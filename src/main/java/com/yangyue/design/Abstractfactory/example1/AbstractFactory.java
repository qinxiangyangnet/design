package com.yangyue.design.Abstractfactory.example1;

/**
 * @program: design
 * @description: 抽象工厂的接口，声明创建抽象产品的对象的操作
 * @author: yueyang
 * @create: 2020-02-26 06:33
 **/
public interface AbstractFactory {
    /**
     * 创建产品A的对象
     * @return
     */
    public  AbstractProductA  createProductA();
    /**
     * 创建产品B的对象
     * @return
     */
    public  AbstractProductB  createProductB();
}
