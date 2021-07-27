package com.yangyue.design.template.demo1;

/**
 * @author gusteau.qin@dbappsecurity.com.cn
 * @date 2021/07/27 10:41:05
 */
public class Client {

    public static void main(String[] args) {

        Account account = new Account();

        if(account.validate("zz0","132")){//验证
            account.caculateInterest("saving");//计算
            account.display();//展示
        }else{
            //提示用户名账号密码错误
        }
    }
}
