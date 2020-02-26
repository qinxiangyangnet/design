package com.yangyue.design.Abstractfactory.example4;


/**
 * @program: design
 * @description:装机方案1.一系列匹配的对象
 * @author: yueyang
 * @create: 2020-02-26 07:22
 **/
public class Schema1 implements AbstractFactory {
    public Object createPart(int type) {
        Object obj=null;
        //type=1 表示创建cpu
        if(type==1){
            obj=new IntelCPU(1156);
        }else if(type==2){
            obj=new GAMainboard(1156);
        }
        return obj;
    }
}
