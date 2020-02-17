package com.yangyue.design.industry.simple.example2;

/**
 * @program: design
 * @description:  工厂，对象用来创建Api对象
 * @author: yueyang
 * @create: 2020-02-17 09:44
 **/
public class Factory {

    /**
     * 根据某些条件去选择究竟创建哪一个具体的实现对象
     * 这些条件可以外部传入，也可以从其他的途径获取
     * 如果只有一个实现，那么可以省略条件
     * @param condition
     * @return
     */
    public  Api  createApi(int condition){
        /**
         * 主要用来选择合适的实现类（）来创建实例对象
         */
        Api api=null;
        if(condition==1)
            api=new ImplA();
        else if(condition==2)
            api=new ImplB();
        return api;

    }
}
