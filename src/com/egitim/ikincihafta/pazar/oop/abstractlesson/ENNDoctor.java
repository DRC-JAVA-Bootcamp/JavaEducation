package com.egitim.ikincihafta.pazar.oop.abstractlesson;

import com.egitim.ikincihafta.pazar.oop.intefacekavrami.ISendMessage;

public class ENNDoctor extends AbstractDoctor implements IMaasHesapla, ISendMessage {

    int aylikHastaSayisi;

//    public void maasHesapla() {
//
//        int doktorMaas = aylikHastaSayisi * 3;
//        System.out.println("Doktor' Salary: " + doktorMaas);
//
//
//    }

    @Override
    public void uzmanlik() {
        super.uzmanlik();
        System.out.println("ENN specialist");
    }

    @Override
    public void muayene() {

    }


    @Override
    public void sendMessageWithSms() {

    }

    @Override
    public void sendMessageWithMail() {

    }

    @Override
    public void maasHesapla() {

    }

    @Override
    public void test() {

    }
}
