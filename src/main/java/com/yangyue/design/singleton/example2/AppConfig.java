package com.yangyue.design.singleton.example2;

import com.yangyue.design.simple.example4.Factory;
import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: design
 * @description:n读取应用配置恩建
 * @author: yueyang
 * @create: 2020-02-21 06:58
 **/
@Data
public class AppConfig {

    //饿汉式
    /**
     * 装载实例的时候就创建了
     */
    private  static   AppConfig appConfig=new AppConfig();
    /**
     * 用来存放配置文件中A的值
     */
    private  String parameterA;
    /**
     * 用来存放配置文件B中的值
     */
    private  String parameterB;

    /**
     * 私有构造方法
     */
    private AppConfig(){
        //调用读取配置文件的方法
        readConfig();
    }

    public static  AppConfig getInstance(){
        return appConfig;
    }

    public void  readConfig(){

        Properties properties = new Properties();
        InputStream in = null;
        try {
            ClassLoader classLoader = Factory.class.getClassLoader();
            in = classLoader.getResourceAsStream("AppConfig.properties");
            System.out.println("现在读取配置文件一次=============================");
            properties.load(in);
            this.parameterA=properties.getProperty("paramA");
            this.parameterB=properties.getProperty("paramB");
        } catch (Exception e) {
            System.out.println("配置文件出错，具体堆栈信息如下");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
     //   Api api = null;
        try {
          //  api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
