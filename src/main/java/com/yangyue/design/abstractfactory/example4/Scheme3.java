package com.yangyue.design.abstractfactory.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 08:20
 **/
public class Scheme3 implements AbstractFactory {
    public Object createPart(int type) {
        Object obj=null;
        //type=1 表示创建cpu
        if(type==1){
            obj=new IntelCPU(1156);
        }else if(type==2){
            obj=new GAMainboard(1156);
        }else if(type==3){
            obj=new HyMemory();
        }
        return obj;
    }

}
