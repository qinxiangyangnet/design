package com.yangyue.design.singleton.example8;

/**
 * @program: design
 * @description: 双重检查加锁
 * @author: yueyang
 * @create: 2020-02-21 08:48
 **/
public class Singleton {

    private  Singleton(){}
    private volatile static  Singleton singleton=null;

    public static Singleton getInstance(){

        //检查实例是否存在
        if(singleton==null){
            //不存在进入同步块
            synchronized (Singleton.class){
                //再次检查实例是否存在，如果不存在才创建实例
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }


    //测试
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(Singleton.getInstance());
        }
    }
}
