package com.egitim.birincihafta.bestpractices;

public class BestPractices {

    public static void main(String[] args) {
        /**
         * Eğer bir değeri integer tanımlaman yetiyor ise daha büyük tanımlama.
         * Hafızada gereksiz yer kaplamasın.
         *
         */
        long deger = 56; // sorun yok. 32 bit olarak tutulur.
        long deger2 = 56l; // 64 bit olarak tutulur.
        long deger3= 5555555555l; //l ekledik. 64 bit olarak tutulur.



    }

}
