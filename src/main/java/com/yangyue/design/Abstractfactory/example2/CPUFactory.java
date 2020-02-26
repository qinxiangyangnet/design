package com.yangyue.design.Abstractfactory.example2;

/**
 * @program: design
 * @description:创建CPU简单工厂
 * @author: yueyang
 * @create: 2020-02-26 06:47
 **/
public class CPUFactory {

    public  static  CPUApi createCPUApi(int type){
        CPUApi api=null;
        //根据参数选择并创建相应的Cpu对象
        if(type==1){
            api=new IntelCPU(1156);
        }else if(type==2){
            api=new AMDCPU(939);
        }
        return api;

    }
}
