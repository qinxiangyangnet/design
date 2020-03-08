package com.yangyue.design.template.example4;

import com.yangyue.design.template.example3.WorkerModel;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 11:37
 **/
public abstract class Template {

    public boolean login(LoginModel loginModel) {
        LoginModel model = this.findUserByUserId(loginModel.getId());

        String   encrpt= this.encrypt(loginModel.getPwd());
        loginModel.setPwd(encrpt);

        return this.match(model,loginModel);
    }

    public abstract   LoginModel  findUserByUserId(String  id);

    public String   encrypt(String pwd){
        return pwd;
    }

    public boolean  match(LoginModel model,LoginModel loginMode){
        if(model.getPwd().equals(loginMode.getPwd())&&model.getId().equals(loginMode.getId())){
            return true;
        }
        return  false;
    }


}
