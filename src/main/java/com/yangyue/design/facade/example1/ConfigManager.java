package com.yangyue.design.facade.example1;

/**
 * @program: design
 * @description: 负责读取配置文件，并把配置文件读取到Model中，是个单例
 * @author: yueyang
 * @create: 2020-02-17 15:45
 **/
public class ConfigManager {

    private static ConfigManager configManager=null;
    private static ConfigModel configModel=null;
    private  ConfigManager(){}

    public static ConfigManager getInstance(){
        if(configManager==null){
            configManager=new ConfigManager();
            //读取配置文件把值设置到ConfigModel中
            configModel=new ConfigModel();
        }
        return  configManager;
    }

    /**
     * 获取配置的数据
     * @return
     */
    public  ConfigModel getConfigModel() {
        return configModel;
    }
}
