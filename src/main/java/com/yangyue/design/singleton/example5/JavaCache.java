package com.yangyue.design.singleton.example5;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-21 08:19
 **/
public class JavaCache {

    private Map<String, Object> map = new HashMap<String, Object>();

    public Object getValue(String key) {
        //先从缓存中去找
        Object o = map.get(key);

        if (o == null) {

            o = key + ",value";
            //把获取到的值设置到缓存中
            map.put(key, o);
        }
        return o;
    }
}
