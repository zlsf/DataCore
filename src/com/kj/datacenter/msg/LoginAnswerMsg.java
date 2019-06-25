package com.kj.datacenter.msg;

import com.kj.datacenter.core.Constant;

public class LoginAnswerMsg extends BaseMessage {

    public LoginAnswerMsg(boolean result) {
	this.setFlag(result);
	this.setMagId(Constant.LOGIN_ANSWER);
    }

    public LoginAnswerMsg() {
    }

}
