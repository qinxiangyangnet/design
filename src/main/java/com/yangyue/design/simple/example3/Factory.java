package com.yangyue.design.simple.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 10:25
 **/
public class Factory {

    public static Api  createApi(){
        //没有条件，直接返回
        return new Impl();
    }
}
