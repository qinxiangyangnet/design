package com.yangyue.design.adapter.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-18 05:32
 **/
public class TimeUtil {

    private  long  a1;
    private long a2;
    public void begin(){
        a1=System.currentTimeMillis();
    }
    public void end(){
        a2=System.currentTimeMillis();
    }

    public  void show(){
        System.out.println(a2-a1);
    }
}
