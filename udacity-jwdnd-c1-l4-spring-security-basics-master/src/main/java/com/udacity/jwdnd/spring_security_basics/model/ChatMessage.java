package com.udacity.jwdnd.spring_security_basics.model;

public class ChatMessage {
    private int messageid;
    private String username;
    private String messageText;

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public int getMessageid() {
        return messageid;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }
}
