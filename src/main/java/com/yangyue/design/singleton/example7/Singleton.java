package com.yangyue.design.singleton.example7;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @program: design
 * @description: 使用内部类创建单例
 * @author: yueyang
 * @create: 2020-02-21 08:41
 **/
public class Singleton {

    private   Singleton(){}

    public static Singleton getInstance(){
       return InnerClass.singleton;
    }

    /**
     * 类几内部类，该内部类的实例与外部的实例没有绑定关系
     * 只有被调用才会装载，从而实现延迟加载
     */
    private static class InnerClass{
        //静态初始化器，有JVM保证线程安全
        private  static  Singleton singleton=new Singleton();
    }


    //测试
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(Singleton.getInstance());
        }
    }

}
