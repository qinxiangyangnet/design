package com.yangyue.design.productmethod.example1;

/**
 * @program: design
 * @description:具体创建器实现对象
 * @author: yueyang
 * @create: 2020-02-22 18:45
 **/
public class ConcreteCreator  extends  Creator{
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
