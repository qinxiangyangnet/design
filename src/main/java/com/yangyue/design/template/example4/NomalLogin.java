package com.yangyue.design.template.example4;

import com.yangyue.design.adapter.example2.LogModel;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 11:44
 **/
public class NomalLogin  extends  Template {
    public LoginModel findUserByUserId(String id) {
        LoginModel loginModel = new LoginModel();
        loginModel.setPwd("testpwd");
        loginModel.setId(id);
        return loginModel;
    }
}
