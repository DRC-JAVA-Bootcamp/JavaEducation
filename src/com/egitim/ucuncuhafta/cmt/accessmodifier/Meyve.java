package com.egitim.ucuncuhafta.cmt.accessmodifier;

import com.egitim.ucuncuhafta.cmt.accessmodifier.farklipaket.Armut;

//classın public işaretlenmezse kendsinden miras alınamaz.
public class Meyve {

    //protected kullanımı. sadece aynı paket içerisinden erişim sağlanır.
    // farklı paketler içerisinde kalıtım varsa çağrılabilir.
    protected int kilo;
    String adi;//friendly
    private String kind;

    public String rengi;


    protected void meyveOlustur(){
        System.out.println("Meyve oluştu");
        kind = "dfgdfg";
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
