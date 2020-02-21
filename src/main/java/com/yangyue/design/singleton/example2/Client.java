package com.yangyue.design.singleton.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-21 06:58
 **/
public class Client {
    //创建读取应用配置
    public static void main(String[] args) {


        for(int j=0;j<5;j++) {
            AppConfig appConfig = AppConfig.getInstance();
            String parameterA = appConfig.getParameterA();
            String parameterB = appConfig.getParameterB();
            System.out.println("读取配置文件"+j+"次" + parameterB + "   " + parameterA);
        }
    }
}
