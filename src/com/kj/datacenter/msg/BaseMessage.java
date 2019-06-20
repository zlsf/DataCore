package com.kj.datacenter.msg;

/**
 * 基本模型
 * 
 * @author zlsf
 *
 */
public class BaseMessage {
    /** 消息ID */
    private int magId;
    /** 设备ID */
    private String deviceId;
    /** 数据内容 */
    private String data;
    /** 说明 */
    private String desc;
    /** 通用表示 */
    private boolean flag;

    public int getMagId() {
	return magId;
    }

    public void setMagId(int magId) {
	this.magId = magId;
    }

    public String getDeviceId() {
	return deviceId;
    }

    public void setDeviceId(String deviceId) {
	this.deviceId = deviceId;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    public String getDesc() {
	return desc;
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
