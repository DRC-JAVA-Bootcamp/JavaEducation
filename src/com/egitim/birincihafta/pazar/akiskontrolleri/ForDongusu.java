package com.egitim.birincihafta.pazar.akiskontrolleri;

public class ForDongusu {
    public static void main(String[] args) {
        /**
         * tekrarlı çalıştırmada kullanılır.
         * yapısı:
         * çalışma şekli: başlangıç değeri belirlenir, sonra bitiş şartına bakar. sonra cümle çalışır, sonra
         * değişime bakar.
         */
        for (int i = 0; i <= 5; i++) { // başlangıç değeri , bitiş sartı ve değişim vardır.
            //    System.out.println(i);
        }
//
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
             //   System.out.format("%5d", i * j);
            }
          //  System.out.println();
        }

        /**
         * for döngüsü farklı formları daha sonra anlatılacak.
         * Nesne, list yapısı özelindeki örneklerde anlatılacak
         */

        /**
         * break, continue
         */

        for (int i = 1; i < 10; i++) {
            if (i % 5 == 0) { //5'e tam bölünen.
            //    System.out.println("5 ile tam bölünen sayı ile karşılaşıldı, Akışa devam etme");
                break;
            }
          //  System.out.println("Akış devam ediyor. Sayı değeri:" + i);
        }
     //   System.out.println("dışarı çıkıldı.");

        int sayi = 3;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.println("2 ile tam bölünen sayı ile karşılaşıldı, Akışa devam etme");
                continue;
            }

            System.out.println("Akış devam ediyor. Sayı değeri:" + i);

            sayi ++;
            i = sayi + i;
            System.out.println(i);
        }

        /**
         * Etiketli break
         */
        tt:
        for (int i = 0; i < 10; i++) {
            System.out.println("ilk for bloğu ilk satırı");

            for (int j = 1; j < 10; j++) {
                if (j % 2 == 0) {
                    System.out.println("2 ile tam bölünen sayı ile karşılaşıldı, Akışa devam etme");
                    break tt;
                }

                System.out.println("ilk for bloğu son satırı");

            }
            System.out.println("test");
        }

        System.out.println("Çıktı tüm fordan");


    }
}
