package com.egitim.ikincihafta.cmt.oop;

public class Ogretmen {

    public String adi;
    public int yasi;
    public boolean mudur;

    public Ogretmen(){
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
