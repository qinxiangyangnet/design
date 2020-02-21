package com.yangyue.design.singleton.example9;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-21 09:05
 **/
public enum Singleton {
    /**
     * 定义一个枚举元素，代表了一个Singleton实例
     */
    uniqueInstance;
    //public  final static Singleton uniqueInstance=new  Singleton();
    public void singletonOperation(){
        System.out.println(Singleton.uniqueInstance.hashCode());
    }
}
