package com.yangyue.design.singleton.example1;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-21 06:58
 **/
public class Client {
    //创建读取应用配置
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            AppConfig appConfig = new AppConfig();
            String parameterA = appConfig.getParameterA();
            String parameterB = appConfig.getParameterB();
            System.out.println("读取配置文件"+i+"次"+parameterB + "   " + parameterA);
        }
    }
}
