package com.yangyue.design.template.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 11:49
 **/
public class Client
{
    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.setId("admin");
        lm.setPwd("workerpwd");
        NomalLogin nomalLogin = new NomalLogin();
        WorkerLogin workerLogin = new WorkerLogin();
        System.out.println("可以登录工作台"+workerLogin.login(lm));
        System.out.println("可以进行普通人的登录"+nomalLogin.login(lm));

    }
}
