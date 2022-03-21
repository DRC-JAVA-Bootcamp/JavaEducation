package com.egitim.ikincihafta.pazar.oop.intefacekavrami;

public interface ISendMessage {

    int sayi = 8;

    public void sendMessageWithSms();

    public void sendMessageWithMail();

    default void test1() {
        test2();

    }

    static void test2() {

    }
}
