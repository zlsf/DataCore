package com.kj.datacenter.msg;

/**
 * 基本模型
 * 
 * @author zlsf
 *
 */
public class BaseMessage {
    /** 消息ID */
    private int msgId;
    /** 设备ID */
    private String deviceId;
    /** 说明 */
    private String desc;
    /** 通用表示 */
    private boolean flag;

    public int getMsgId() {
	return msgId;
    }

    public void setMsgId(int msgId) {
	this.msgId = msgId;
    }

    public String getDesc() {
	return desc;
    }

    public String getDeviceId() {
	return deviceId;
    }

    public void setDeviceId(String deviceId) {
	this.deviceId = deviceId;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

    public boolean isFlag() {
	return flag;
    }

    public void setFlag(boolean flag) {
	this.flag = flag;
    }
}
