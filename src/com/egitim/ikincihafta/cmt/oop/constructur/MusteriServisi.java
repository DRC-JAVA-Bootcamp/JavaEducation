package com.egitim.ikincihafta.cmt.oop.constructur;

public class MusteriServisi {
    public boolean admin;

    public MusteriServisi(boolean admin){
        this();
        this.admin = admin;
    }

    public MusteriServisi(boolean admin, int no){
        this(admin);
        this.admin = admin;
    }

    public MusteriServisi(){
        System.out.println("Müsteri servisi şuan ayakta.");
    }

    public void getMusteriVerileri(){
        int musterino = 2;

        if(admin){
            // musterinin tum verisini getir
        } else {
            //musterinin sadece isim ve numara bilgilerini getir.
        }

    }

}
