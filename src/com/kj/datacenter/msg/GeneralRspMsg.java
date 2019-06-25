package com.kj.datacenter.msg;

import com.kj.datacenter.core.Constant;

public class GeneralRspMsg extends BaseMessage {

    public GeneralRspMsg() {
	this.setDesc("通用应答");
	this.setFlag(true);
	this.setMsgId(Constant.GeneralRspMsg);
    }
    
 

}
