package com.yangyue.design.decorator.example1;

import lombok.Data;

/**
 * @program: design
 * @description:装饰器的具体实现对象，向组件添加职责
 * @author: yueyang
 * @create: 2020-02-28 20:01
 **/

public class ConcreteDecoratorA extends  Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 添加状态
     */
    private  String addedState;
    //get  set方法省略

    public  void operation(){
        //调用父类的方法，可以在调用前后执行一些附加操作
        //在这里使用可以使用添加状态
        super.operation();
    }

}
