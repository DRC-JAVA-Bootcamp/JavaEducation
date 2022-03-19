package com.egitim.birincihafta.pazar.akiskontrolleri;

import java.util.Random;

public class WhileDongusu {

    /**
     * While
     * mantıksal ifade doğru olduğu sürece devam eder.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomSayi = random.nextInt(10);
//        int sayi = (int) (10 * Math.random());

         while (randomSayi < 7){ // 11 olursa sonuç ne olur?
             System.out.println("sayının değeri:" + randomSayi);
             randomSayi = random.nextInt(10);
         }
         System.out.println("sayının değeri:" + randomSayi);

        double random1 = Math.random();//0.0, 1.0
        while (random1 < 0.3) {//çıktısı ne olur ?
            System.out.println("While döngüsüne girdi. değer:" + random1);
            random1 = Math.random();
        }


    }
}
