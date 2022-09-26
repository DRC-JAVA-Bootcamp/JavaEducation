package com.egitim.ikincihafta.pazar.string;

public class StringYapisi {

    /**
     * Text tutmak için kullanılırlar.
     */

    public static void main(String[] args) {
        /**
         * Çeşitli oluşturulma şekilleri vardır.
         */

        String str = new String("Nesrin");
        String str33 = new String("Nesrin");
        String str1 = "Nesrin";
        String str2= "Nesrin";
        str1 = "Murat";

        if (str1 == str2) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        if (str == str33) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        if (str.equals(str33)) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        String a1 = "Burak";
        String a2 = "Burak";

        if (a1 == a2) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        /**
         * == ve .equals kullanım farkı.
         */

        if (str.equals(str1)) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        /**
         * substring kullanımı
         */

        String cumle = "Bu bir cümledir";
        cumle = cumle.substring(3,8);//index önemli.
        System.out.println(cumle);

        /**
         * String immutable
         */

        String name = "Nesrin";
        name = "Ahmet" + " Aşan";
        System.out.println(name);
        //Hafızada Nesrin ve Nesrin Aşan eklenmiş oldu.

        String firstName = new String("Burak");// A11
        firstName = "Burak"; //B11
        firstName = new String("Burak"); //A12
        firstName = "Burak";//B11

        System.out.println(firstName);

        String var = "son durumdaki sayac degeri= ";
        for (int i = 0; i < 10; i++) {
            var = var + i;
            System.out.println(var);
        }

        /**
         * String builder kullanımı
         */
        StringBuilder stringBuilder = new StringBuilder("son durumdaki sayac degeri= ");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
            System.out.println(stringBuilder.toString());
        }

    }


}
