package com.yangyue.design.singleton.example4;

/**
 * @program: design
 * @description: 懒汉式
 * @author: yueyang
 * @create: 2020-02-21 07:36
 **/
public class Singleton {

    /**
     * 不允许外面new这个实例
     * 私有化构造方法，内部控制创建实例的数目
     *
     */
    private  Singleton(){}

    /**
     * 定义一个变量来存储创建好的实例
     * 因为这个变量需要在静态方法使用，所以需要加上static
     */
    private   static  Singleton uniquesInstance=null;

    /**
     * 延迟加载
     * 定义一个方法为客户端提供类实例
     * 这个方法需要定义成为类的方法，也就是需要加static
     * @return
     */
    public static synchronized  Singleton  getInstance(){
        //判断存储实例的变量是否有值
        if(uniquesInstance==null){
            //如果没有就创建一个实例，并把值赋值给存储实例的变量
            uniquesInstance=new Singleton();
        }
        //不能这样做，因为调用一次，创建一个，失去单例的意义
       // return  new Singleton();
        //如果有值，直接使用
        return uniquesInstance;
    }

    /**
     * 可以有自己的属性和方法，只是控制创建实例的方式
     */
    private  int  abc=0;
    public void t(){

    }

    //测试
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(getInstance());
        }
    }
    /**
     * 从时间空间上看：
     * 懒汉式以时间换空间（需要做判断）
     * 饿汉式以空间换时间（类加载的时候就创建了，这种做法相对较好，如果一定会用的话，）
     *
     * 从线程安全
     * 懒汉式：不安全
     * 饿汉式：安全的（虚拟机保证）
     */
}
