package com.imooc.service.websocket.pojo;

import java.io.Serializable;

public class DataContent implements Serializable {

    private Integer action;      //动作类型
    private ChatMsg chatMsg;    //聊天内容
    private String expand;      //扩展字段

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public ChatMsg getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(ChatMsg chatMsg) {
        this.chatMsg = chatMsg;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }
}
