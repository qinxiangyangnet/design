package com.yangyue.design.template.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 11:46
 **/
public class WorkerLogin extends   Template {
    public LoginModel findUserByUserId(String id) {
        LoginModel loginModel = new LoginModel();
        loginModel.setPwd("workerpwd");
        loginModel.setId(id);
        return loginModel;
    }

    public  String encrypt(String pwd){
        System.out.println("使用MD5加密"+pwd);
        return pwd;
    }
}
