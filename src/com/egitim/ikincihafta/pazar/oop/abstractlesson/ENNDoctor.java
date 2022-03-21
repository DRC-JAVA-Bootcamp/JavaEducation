package com.egitim.ikincihafta.pazar.oop.abstractlesson;

public class ENNDoctor extends AbstractDoctor{

    int aylikHastaSayisi;

    public void maasHesapla() {

        int doktorMaas = aylikHastaSayisi * 3;
        System.out.println("Doktor' Salary: " + doktorMaas);


    }

    @Override
    public void uzmanlik() {
        super.uzmanlik();
        System.out.println("ENN specialist");
    }
}
