package com.kj.datacenter.msg;

import com.kj.datacenter.core.Constant;

public class HeartMsg extends BaseMessage {

    public HeartMsg() {
	this.setDesc("心跳");
	this.setMsgId(Constant.HRAET_BIT);
    }
}
