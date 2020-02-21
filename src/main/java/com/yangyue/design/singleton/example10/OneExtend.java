package com.yangyue.design.singleton.example10;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design
 * @description: 控制实例的数目
 * @author: yueyang
 * @create: 2020-02-21 09:15
 **/
public class OneExtend {

    private  OneExtend(){}

    private final static String DEFUALT_PREKEY="Cache";
    //实例的调度问题，只要你没有达到最大的限度，就一直new
    private static Map<String,OneExtend> map=new HashMap<String, OneExtend>();

    private  static int num=1;

    private final static int MAX_NUM=3;

    public  static OneExtend getInstance(){
        String key= DEFUALT_PREKEY+num;
        OneExtend oneExtend = map.get(key);
        if(oneExtend==null){
            oneExtend=new OneExtend();
            map.put(key,oneExtend);
        }
        num++;
        if(num>MAX_NUM){
            //如果达到最大数目，那么就重复从1获取
            num=1;
        }
        return  oneExtend;
    }

    public static void main(String[] args) {
        OneExtend instance1 = getInstance();
        OneExtend instance2 = getInstance();
        OneExtend instance3 = getInstance();
        OneExtend instance4 = getInstance();
        OneExtend instance5 = getInstance();
        OneExtend instance6 = getInstance();
        OneExtend instance7= getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
        System.out.println(instance5);
        System.out.println(instance6);
    }


}
