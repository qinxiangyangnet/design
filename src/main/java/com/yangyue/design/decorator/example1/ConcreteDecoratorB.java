package com.yangyue.design.decorator.example1;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 20:01
 **/
public class ConcreteDecoratorB extends  Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private  void  addedBehavior(){}

    public void operation(){
        super.operation();
        addedBehavior();
    }
}
