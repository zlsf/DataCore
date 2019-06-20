package com.kj.datacenter.msg;

import com.kj.datacenter.core.Constant;

public class GeneralRspMsg extends BaseMessage {

    public GeneralRspMsg() {
	this.setData("");
	this.setDesc("通用应答");
	this.setFlag(true);
	this.setMagId(Constant.GeneralRspMsg);

    }
    
 

}
