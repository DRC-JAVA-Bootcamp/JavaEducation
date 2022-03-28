package com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi;

public class Flower extends FlowerBase{

    private static String color;
    private String height;
    public String ad = "Çiçek";

//    public Flower(String color){
//        this.color = color;
//    }


    public void smell(){
        System.out.println("flower smells good");
        String ad = super.ad;
    }

    public static void fed(){
        System.out.println("flower is fed");
    }


}
