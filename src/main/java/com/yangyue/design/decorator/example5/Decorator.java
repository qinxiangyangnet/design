package com.yangyue.design.decorator.example5;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 00:07
 **/
public abstract  class Decorator implements Component {

    private  Component component=null;


    public  Decorator(Component component){
        this.component=component;
    }

}
