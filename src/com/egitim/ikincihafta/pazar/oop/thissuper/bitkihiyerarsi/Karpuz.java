package com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi;

public class Karpuz {

    private int adet;
    public static final int karpuzKilogramFiyati = 10;

    public Karpuz(){
        System.out.println("Karpuzun özelliği Diyarbakır karpuzudur.");

    }

    public Karpuz(int adet){
        this();
        this.adet = adet; //this içerisinde bulunduğu classa ait global değişkenlere erişmek için kullanılabilir

    }

    public Karpuz(String turu){
        System.out.println("Karpuzun türü Diyarbakır karpuzudur.");

    }

    public Karpuz(String sahibi, String yetistirlmeSekli){
        this("Diyarbakır");
        System.out.println("Karpuyetiştirilme şekli");

        this.adet = adet; //this içerisinde bulunduğu classa ait global değişkenlere erişmek için kullanılabilir

    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int elimdeKalanPara(int toplamParam){
        int karpuzaOdenenUcret = this.karpuzFiyatiHesapla();
        toplamParam -= karpuzaOdenenUcret;

        return toplamParam;
    }

    private int karpuzFiyatiHesapla(){
        int karpuzFiyati = adet * karpuzKilogramFiyati;
        return karpuzFiyati;

    }




}
