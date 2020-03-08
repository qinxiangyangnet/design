package com.yangyue.design.template.example6;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 15:24
 **/
public class Client {
    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.setId("admin");
        lm.setPwd("workerpwd");
        Template lt = new Template();
       boolean flag= lt.login(lm, new LoginCallBack() {
            public LoginModel findLoginUser(String loginId) {
                LoginModel loginModel = new LoginModel();
                loginModel.setId(loginId);
                loginModel.setPwd("testpwd");
                return loginModel;
            }

            public String encryptPwd(String pwd, Template loginTemplate) {
                return loginTemplate.encrypt(pwd);
            }

            public boolean match(LoginModel lm, LoginModel dblm, Template loginTemplate) {
                return loginTemplate.match(lm,dblm);
            }
        });
        System.out.println("可以进行普通人登录"+flag);

        boolean ff= lt.login(lm, new LoginCallBack() {
            public LoginModel findLoginUser(String loginId) {
                LoginModel loginModel = new LoginModel();
                loginModel.setId(loginId);
                loginModel.setPwd("workerpd");
                return loginModel;
            }

            public String encryptPwd(String pwd, Template loginTemplate) {
                System.out.println("");
                return loginTemplate.encrypt(pwd);
            }

            public boolean match(LoginModel lm, LoginModel dblm, Template loginTemplate) {
                return loginTemplate.match(lm,dblm);
            }
        });
        System.out.println("可以进行登陆工作台"+ff);


    }
}
