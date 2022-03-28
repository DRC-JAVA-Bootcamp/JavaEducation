package com.egitim.ucuncuhafta.cmt.designpattern.factory;

public class SendSms implements ISendMessage{
    @Override
    public void sendMessage() {
        System.out.println("Send message with SMS");

    }
}
