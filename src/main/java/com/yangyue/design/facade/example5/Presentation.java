package com.yangyue.design.facade.example5;

/**
 * @program: design
 * @description: 表现层
 * @author: yueyang
 * @create: 2020-02-17 15:37
 **/
public class Presentation {

    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigModel();
        if(cm.isNeedGenPresentaion()){
            System.out.println("正在生成表现层代码文件");
        }
    }
}
