package com.anji.springbootjwt.model;

import java.io.Serializable;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 10:00
 */
public class TokenResult implements Serializable {
    //状态
    private boolean flag=true;

    //返回消息内容
    private String msg="";

    //返回token
    private String token="";

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
