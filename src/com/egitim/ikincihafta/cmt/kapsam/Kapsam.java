package com.egitim.ikincihafta.cmt.kapsam;

public class Kapsam {
    /**
     * Değişkenler tanıtıldıkları yerdeki blok içerisindeki yaşam süresidir.
     *
     */
    public int sayi = 5; // nesne değişkeni
    public static int sayiDegiskeni = 10;

    public static void main(String[] args) {
        String ad = "Nesrin"; // Yerel değişken
        for (int i = 0; i <5; i++) {
            int yas = i;//blok içerisindeki yerel değişkenler.
            ad = "Nesrin";

        }


    }


    public void toplama(int ilkSayi, int ikinciSayi){
        int deger = 0;
    }

    /**
     * Aynı kapsamda aynı isimli iki değişken bulunamaz.
     * Aynı kapsamda biri yerel, biri nesne değişkeni oalcak şekilde iki değişken bulunabilir.
     */


}
