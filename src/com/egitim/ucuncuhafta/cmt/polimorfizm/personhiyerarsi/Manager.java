package com.egitim.ucuncuhafta.cmt.polimorfizm.personhiyerarsi;

public class Manager extends Engineer {

    int odasininKati;
    String departman;
    private final static int maasKatsayisi = 1500;

    public int getOdasininKati() {
        return odasininKati;
    }

    public void setOdasininKati(int odasininKati) {
        this.odasininKati = odasininKati;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

      @Override
      public int maasHesapla() {
        int managerSalary = maasKatsayisi * calistigiYil;

       return managerSalary;
    }
}
