package com.yangyue.design.abstractfactory.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-26 07:23
 **/
public class Scheme2 implements AbstractFactory {

        public Object createPart(int type) {
            Object obj=null;
            //type=1 表示创建cpu
            if(type==1){
                obj=new AMDCPU(939);
            }else if(type==2){
                obj=new MSIMainboard(939);
            }
            return obj;

    }
}
