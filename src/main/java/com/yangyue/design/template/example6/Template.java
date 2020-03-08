package com.yangyue.design.template.example6;

import com.yangyue.design.template.example4.LoginModel;

/**
 * @program: design
 * @description: 登录控制模板
 * @author: yueyang
 * @create: 2020-02-29 11:37
 **/
public  class Template {

    public boolean login(com.yangyue.design.template.example6.LoginModel loginModel, LoginCallBack c) {
        com.yangyue.design.template.example6.LoginModel loginUser = c.findLoginUser(loginModel.getId());

        String   encrpt= this.encrypt(loginModel.getPwd());
        loginModel.setPwd(encrpt);

        return c.match(loginUser,loginModel,this);
    }


    public String   encrypt(String pwd){
        return pwd;
    }

    public boolean  match(com.yangyue.design.template.example6.LoginModel model, com.yangyue.design.template.example6.LoginModel loginMode){
        if(model.getPwd().equals(loginMode.getPwd())&&model.getId().equals(loginMode.getId())){
            return true;
        }
        return  false;
    }


}
