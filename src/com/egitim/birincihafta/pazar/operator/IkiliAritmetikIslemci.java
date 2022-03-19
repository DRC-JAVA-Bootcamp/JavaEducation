package com.egitim.birincihafta.pazar.operator;

public class IkiliAritmetikIslemci {
    public static void main(String[] args) {
        /**
         * 5 tanedir
         * Bunlar: +, -, /, %, *
         */

//        int i = 3*5;
//        System.out.println(i);//15
//
        int j = 10 / 3;
     //   System.out.println(j);
//
        int k = 10 % 3;
       // System.out.println(k);
//
        double m = 10.0 / 3.0;
     //   System.out.println(m);//sonucu ne olur
//
        double n = 10.0 % 3.0;
    //    System.out.println(n);
//
        double z = (double) 10 /(double) 3;
    //    System.out.println(z);

        int i = 5;
        int yy = i + 2;
       // System.out.println(yy);
        i += 2;
        i = i + 2;
      //  System.out.println(i);
//
        i -= 1;
        i = i-1;
    //    System.out.println(i);

        //System.out.println(i + 2);
       // System.out.println(i += 2);


        /**
         * soru:
         */

        int x = 1, y = 2, r = 3;
      //  r = x + y * r;
       // System.out.println(r);

   //     r = (x + y) * r;
    //    System.out.println(r);

     //   r *= x + y * r;
      //  System.out.println(r);

        /**
         * sonuc?
         */

       int t = 32324234 * 53242342;
        //    System.out.println(t);

        /**
         * Aşağıdaki 3 değerin çıktısı aynıdır.
         */

        int sayi = 0;
        sayi = sayi + 1;
        sayi += 1;
        sayi++;
//        System.out.println(sayi);

        /**
         * tekli operator kullanımının öncesi ve sonra kullanımı önemlidir.
         *
         */
        int ilkSayi = 5;
        int ucuncuSayi = ilkSayi++;
     //   System.out.println("İlkSayi: " + ilkSayi); //
     //   System.out.println("üçüncü Sayi:" + ucuncuSayi);//


//        int sayi = 10;
//        sayi++;
//        System.out.println(sayi);

        int islem = 45;
      //  islem--;
        int i1 = islem - 1;
       // System.out.println(islem);

        /**
         * soru
         */
        int a = 2;
        int b = 3;
        int c = ++b;
        int d = a++;
    //    System.out.println("a : " + a);//
     //   System.out.println("b : " + b);//
     //   System.out.println("c : " + c);//
    //    System.out.println("d : " + d);//


        /**
         * String ile kullanımı farklı sonuç verecektir.
         * NOT: + işlemcisi işleme soldan başlar. Soldaki işlenenin tipine göre karar verililir.
         */
    //    System.out.println("20" + "30");
        System.out.println(20 + 10 + "Hello");
//
        System.out.println("Hello" + (20 + 10));//sonuc?
//
        System.out.println (25 + 2 + "Hello" + 4 + 5);//sonuc?


    }


}
