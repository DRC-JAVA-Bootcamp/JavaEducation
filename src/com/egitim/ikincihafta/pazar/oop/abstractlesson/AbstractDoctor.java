package com.egitim.ikincihafta.pazar.oop.abstractlesson;

public abstract class AbstractDoctor {

    /**
     * Nesnelerin ve methodların üzerinden soyutluk yaparız.
     * Method soyutluğu: interface, abstract methods.
     * Nesne soyutluğu
     */

    private String isim;


    public void uzmanlik(){
        System.out.println("Doktor lisans mezunudur.");
    }

    public void maasZamHesaplama(Integer mevcutMaas, int calistigiYilSuresi, int zamKatsayisi){

        mevcutMaas = mevcutMaas * calistigiYilSuresi * zamKatsayisi;

        System.out.println(mevcutMaas);

    }

    public abstract void muayene();


}
