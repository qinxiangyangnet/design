package com.yangyue.design.Abstractfactory.example1;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 06:33
 **/
public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
