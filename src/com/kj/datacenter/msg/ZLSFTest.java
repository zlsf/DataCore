package com.kj.datacenter.msg;

public class ZLSFTest extends BaseMessage {
    
    String name;
    String sex;
    
    public ZLSFTest() {
	this.setDesc("测试");
	this.setMsgId(-1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
}
