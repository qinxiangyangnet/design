package com.yangyue.design.template.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 12:26
 **/
public class NomalLogin2  extends Template{
    public LoginModel findUserByUserId(String id) {
        NomalLoginModel loginModel = new NomalLoginModel();
        loginModel.setPwd("testpwd");
        loginModel.setId(id);
        loginModel.setAnswer("testanwser");
        loginModel.setQuestion("testquestion");
        return loginModel;
    }
    public boolean match(LoginModel model,LoginModel loginMode){
        //父类已经做了检测
        boolean match = super.match(model, loginMode);
        if(match){
            //单独对问题和答案进行匹配
            NomalLoginModel nl = (NomalLoginModel) model;
            NomalLoginModel mode = (NomalLoginModel) loginMode;
            //进行比较
            //...

        }
        return false;
    }
}
