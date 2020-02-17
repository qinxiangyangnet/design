package com.yangyue.design.industry.simple.example6;


import com.yangyue.design.industry.simple.example2.ImplA;
import com.yangyue.design.industry.simple.example2.ImplB;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 10:25
 **/
public class Factory {

    private static int count = 0;

    public static Api createApi() {
    Api api = null;
        if (count < 3) {
            api = new Impl();
            count++;
        } else {
            api = new Impl2();
            count++;
        }
        return api;
    }
}
