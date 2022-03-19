package com.egitim.birincihafta.pazar.staticfinal;

public class staticfinal {

    public static int sayi;
    public final int numara = 10;
    public static final double pi = 3.14;
    int deger = 2;

    public static void main(String[] args) {

    }

    public void test(){
       sayi = 2;
       deger = 4;
       MathUtil.topla(sayi, deger);
       Math.random();

    }


}
