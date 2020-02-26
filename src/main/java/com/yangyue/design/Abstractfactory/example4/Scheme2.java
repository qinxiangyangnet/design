package com.yangyue.design.Abstractfactory.example4;

import com.yangyue.design.Abstractfactory.example2.GAMainboard;

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
