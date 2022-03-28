package com.egitim.ucuncuhafta.cmt.designpattern.factory;

public class SendFax implements ISendMessage{

    @Override
    public void sendMessage() {
        System.out.println("Send message with FAX");

    }
}
