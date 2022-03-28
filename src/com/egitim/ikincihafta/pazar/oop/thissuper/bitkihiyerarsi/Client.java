package com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi;

public class Client {
    public static void main(String[] args) {
        Karpuz karpuz = new Karpuz();
        karpuz.setAdet(2);
        int i = karpuz.elimdeKalanPara(100);
        System.out.println(i);

        Rose rose = new Rose("red");

    }
}
