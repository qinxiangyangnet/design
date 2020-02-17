package com.yangyue.design.simple.example4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-17 10:25
 **/
public class Factory {


    public static Api createApi() {
        /**
         * 如何选择的问题
         * Impl ,Impl2
         * 如何选？==》选择的参数是什么？==>参数从何而来？==》
         * 1，参数来自客户端client
         * 2，参数来自配文件
         * 3，参数来自系统自身，比如运行期间某个值
         *
         *
         *
         */
        Properties properties = new Properties();
        InputStream in = null;
        try {
            ClassLoader classLoader = Factory.class.getClassLoader();
            in = classLoader.getResourceAsStream("FactoryTest.properties");
            properties.load(in);
        } catch (Exception e) {
            System.out.println("装在工厂的配置出错，具体堆栈信息如下");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        Api api = null;
        try {
            api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return api;
    }
}
