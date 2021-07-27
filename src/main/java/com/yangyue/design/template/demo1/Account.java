package com.yangyue.design.template.demo1;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 10:37:25
 */
public class Account {


    //验证用户信息
    public  Boolean validate(String account ,String password){


        return false;
    }

    //计算利息
    public  void caculateInterest(String type){
        if(type.equals("current")){

        }else if(type.equals("saving")){

        }
    }

    //显示结果
    public  void display(){
        //具体代码省略
    }
}
