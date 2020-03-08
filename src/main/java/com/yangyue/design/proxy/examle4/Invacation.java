package com.yangyue.design.proxy.examle4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-03-08 14:15
 **/
public class Invacation  implements InvocationHandler {

    private  BaseService obj;//具体被监控的对象

    public  Invacation(  BaseService obj){
        this.obj=obj;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object  oo=new Object();
        if("eat".equals(method.getName())){
            wash();
           oo= method.invoke(this.obj,objects);
        }else{
           oo= method.invoke(this.obj,objects);
            wash();
        }

        return oo;
    }

    public void  wash(){
        System.out.println("洗手");
    }
}
