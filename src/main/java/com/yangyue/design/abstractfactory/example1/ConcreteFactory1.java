package com.yangyue.design.abstractfactory.example1;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 06:33
 **/
public class ConcreteFactory1 implements AbstractFactory {
    //A1,B1可能是有联系的，通过AbstractFactory约束，
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
