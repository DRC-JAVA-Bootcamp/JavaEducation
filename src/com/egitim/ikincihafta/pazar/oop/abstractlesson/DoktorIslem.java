package com.egitim.ikincihafta.pazar.oop.abstractlesson;

public class DoktorIslem {

    public static void main(String[] args) {

        ENNDoctor ennDoctor = new ENNDoctor();
        ennDoctor.maasZamHesaplama(50000, 2, 3);
        ennDoctor.uzmanlik();

        EyeDoctor eyeDoctor = new EyeDoctor();
        eyeDoctor.maasZamHesaplama(50000, 6, 3);


    }
}
