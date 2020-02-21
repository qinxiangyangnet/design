package com.yangyue.design.singleton.example3;

/**
 * @program: design
 * @description: 饿汉式
 * @author: yueyang
 * @create: 2020-02-21 07:36
 **/
public class Singleton {

    /**
     * 私有构造方法，内部控制创建实例
     */
    private Singleton(){}
    //装载类的时候，就创建实例
    //静态属性，在装载这个类的时候，ClassLoader，本身的范围在类装载的时候
    //直接在这里创建实例，只会创建一次，因为类只会加载一次（装载的时候初始化，由ClassLoader保证,特性static）
    private   static  Singleton uniquesInstance=new Singleton();

    /**
     *
     * @return
     */
    public  static Singleton  getInstance(){
        //直接使用已经创建好的实例
        return  uniquesInstance;
    }

    //测试
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(getInstance());
        }
    }
    /**
     * 可以有自己的属性和方法
     */
}
