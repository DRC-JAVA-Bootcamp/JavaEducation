package com.egitim.birincihafta.cmt;

public class CmtSorulari {


    public static void main(String[] args) {
        /**
         * soru: çıktısı ne olur?
         */

        String degerStr = "10000000";
        int degerInt = Integer.valueOf(degerStr);
      //  System.out.println(degerInt);

        /**
         * soru: çıktısı ne olur?
         */
        String degerStr2 = "10_000_000";
      //  int degerInt2 = Integer.valueOf(degerStr2);
       // System.out.println(degerInt2);


        /**
         *  Soru:
         *  Aşağıdaki kod çalışır mı?
         *
         *  int sayi = 5l;
         *  System.out.println(sayi);
         *
         */

        /**
         * Soru: çıktısı ne olur?
         *
         */
        int ii = (int) 5455555555555555555L;
      //  System.out.println(ii);


        /**
         *
         */

        long longValue = 10076756756756656L;
        int intVal = (int) longValue;
        System.out.println("int val:" + intVal);

    }
}
