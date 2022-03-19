package com.egitim.ikincihafta.cmt.oop;

public class Ogretmen {

    public String adi;
    public int yasi;
    public boolean mudur;

    public Ogretmen(boolean isMudur){
        mudur = isMudur;
    }

    public Ogretmen(boolean isMudur, String brans){
        mudur = isMudur;
    }


    public Ogretmen(String brans){
        System.out.println("öğretmenin bransı:" + brans);
    }

    public void getOgrenci(){
        if(mudur){
            //getOgrenciList
            System.out.println("burada çağrılan öğregci listesini müdür göroru");
        }else
            //getOgrenci
            System.out.println("burada çağrılan öğregci listesinin bir kısmını görür.");

    }


}
