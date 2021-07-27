package com.yangyue.design.template.demo1;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 10:45:16
 */
public abstract class AbstractTemplateAccount {

    public void account(String name, String password, String type) {

        validate(name, password);
        caculateInterest(type);
        display();
    }


    //验证用户信息
    public Boolean validate(String account, String password) {


        return false;
    }

    //显示结果
    public void display() {
        //具体代码省略
    }

    abstract void caculateInterest(String type);
}
