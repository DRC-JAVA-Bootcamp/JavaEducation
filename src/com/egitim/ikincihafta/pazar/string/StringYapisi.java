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

    }


}
