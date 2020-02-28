package com.yangyue.design.decorator.example3;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design
 * @description: 内存中的模拟数据库
 * @author: yueyang
 * @create: 2020-02-28 20:15
 **/


public class TempDB {

    private TempDB(){}

    public static Map<String,Double> map=new HashMap<String, Double>();
    static {
        map.put("詹三",10000.0);
        map.put("李四",20000.0);
        map.put("王五",30000.0);
    }
}
