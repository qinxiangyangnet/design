package com.yangyue.design.adapter.example1;

/**
 * @program: design
 * @description:适配器
 * @author: yueyang
 * @create: 2020-02-18 03:58
 **/
public class Adapter implements  Target {
    /**
     * 持有需要被适配的接口对象
     */
    private  Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee
     */
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    public void request(){
        //可能已经转调已经实现了方法，并进行适配
        adaptee.specificRequest();
    }

}
