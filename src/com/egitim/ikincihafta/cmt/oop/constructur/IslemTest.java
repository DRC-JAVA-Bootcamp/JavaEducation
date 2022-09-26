package com.egitim.ikincihafta.cmt.oop.constructur;

public class IslemTest {

    public static void main(String[] args) {
        islem(2, 3);
    }


    public static DortIslem islem(int ilkSayi, int ikinciSayi){
        int i = 5;
        int k = 5;
        System.out.println(i == k);

        int toplam = ilkSayi + ikinciSayi;

        DortIslem dortIslem = new DortIslem(toplam);

        dortIslem.setCikar(ilkSayi - ikinciSayi);
        dortIslem.setCarp(ilkSayi * ikinciSayi);
        dortIslem.setBol(ilkSayi / ikinciSayi);

        int cikar = dortIslem.getCikar();
        System.out.println(cikar);

        int max = Math.max(1, 3);
        return dortIslem;

    }
}
