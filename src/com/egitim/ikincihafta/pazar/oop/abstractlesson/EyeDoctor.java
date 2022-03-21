package com.egitim.ikincihafta.pazar.oop.abstractlesson;

public class EyeDoctor extends AbstractDoctor{

    private int tecrubeYili;

  //  public EyeDoctor(int tecrubeYili){
   //     this.tecrubeYili = tecrubeYili;
 //   }

    public void maasHesapla() {
        System.out.println(tecrubeYili * 4000);
    }

    public int getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(int tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }
}
