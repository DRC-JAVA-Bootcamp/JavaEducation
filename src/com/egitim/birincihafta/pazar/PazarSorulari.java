package com.egitim.birincihafta.pazar;

import java.util.Random;

public class PazarSorulari {

    public static void main(String[] args) {

        /**
         * Soru: Çıktısı
         */
        //   System.out.println(23 + 2 + "Merhaba");

        /**
         * soru
         */
        int h = 0;
        while (h < 10) {
            System.out.println(h);

            if (h * 2 == 10) {
                break;
            }
            h++;
        }

        /**
         * soru: Çıktısı ne olur?
         *
         */
        Random random = new Random();
        int sayi = random.nextInt(10);
        switch (4) {
            case 1:
                System.out.println("Ahmet");
                break;
            case 2:
                System.out.println("Ahmet");
            case 3:
                break;
            case 4:
                System.out.println("Mehmet");
            case 6:
                System.out.println("Murat");
            default:
                System.out.println("Doruk");

        }

        /**
         * Okul puanlarının harf karşılığını yazan program.
         * Random alınabilir değerler.
         * 0 - 35 arası FF
         * 35 - 50 arası DC
         * 50 - 70 arası BB
         * 70 - 100 arası AA
         */

        Random randomPuan = new Random();
        int puan = 35;
        if (puan > 0 && puan <= 35)
            System.out.println(puan + "puanının harf karşılığı: " + "FF");
        else if (puan >= 35 && puan < 50)
            System.out.println(puan + "puanının harf karşılığı: " + "DC");
        else if (puan >= 50 && puan < 70)
            System.out.println(puan + "puanının harf karşılığı: " + "BB");
        else if (puan >= 70 && puan < 100)
            System.out.println(puan + "puanının harf karşılığı: " + "AA");
        else
            System.out.println(puan + "hesaplanamayan puan tipi");

        switch (puan) {
            case 0:
            case 1:
            case 2:
            case 35:
                System.out.println(puan + "puanının harf karşılığı: " + "FF");
                break;

        }

        /**
         * soru: 1, 2, 3....20 ye kadar olan sayıların toplamı?
         *
         */
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum * i;
        }

        System.out.println(sum);


        /**
         * çıktısı ne olur?
         */
        int deger = 0;
        for (int i = 0; i < 10; i++) {
            deger = deger + i;
        }
        System.out.println(deger);
    }
}
