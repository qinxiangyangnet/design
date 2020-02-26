package com.yangyue.design.abstractfactory.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:00
 **/
public class MainboardFactory {

    public  static  MainboardApi createMainboardApi(int type){
        MainboardApi api=null;
        //根据参数选择并创建相应的Cpu对象
        if(type==1){
            api=new GAMainboard(1156);
        }else if(type==2){
            api=new MSIMainboard(939);
        }
        return api;

    }
}
