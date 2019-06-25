package com.kj.datacenter.msg;

import com.kj.datacenter.core.Constant;

public class LoginMsg extends BaseMessage {

    private LoginModel loginMode;

    public LoginMsg(LoginModel loginModel) {
	this.setDesc("登陆");
	this.setMsgId(Constant.LOGIN);
	this.loginMode=loginModel;
    }

    public LoginMsg() {
    }

    public LoginModel getLoginMode() {
	return loginMode;
    }

    public void setLoginMode(LoginModel loginMode) {
	this.loginMode = loginMode;
    }

}
