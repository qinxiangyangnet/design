package com.yangyue.design.singleton.example6;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design
 * @description:  按照缓存的方式去实现单例
 * @author: yueyang
 * @create: 2020-02-21 08:30
 **/
public class Singleton {

    private   Singleton (){}
    //y用来标志在缓存中的存放
    private final static String   DEFAULT_KEY="One";

    //缓存实例容器
    private static  Map<String,Object> map=new HashMap<String, Object>();

    public  static Singleton  getInstance(){

        Singleton singleton = (Singleton) map.get(DEFAULT_KEY);
        if(singleton==null){
            singleton=new Singleton();
            map.put(DEFAULT_KEY,singleton);
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
