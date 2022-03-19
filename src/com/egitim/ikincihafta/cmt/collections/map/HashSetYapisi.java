package com.egitim.ikincihafta.cmt.collections.map;

import com.egitim.ikincihafta.cmt.collections.dizi.Ogretmen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetYapisi {

    public static void main(String[] args) {
        /**
         * Hashset
         * List gibidir. Veri depolamak için kullanılır.
         * Lİstten farkı ise aynı elemanları saydırmaz.
         *
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("Nesrin");
        stringList.add("Ayşe");
        stringList.add("Doruk");
        stringList.add("Doruk");
        for (String isim : stringList) {
            System.out.println("list içeirsindeki isim: " + isim);
        }
        System.out.println("Listin uzunluğu: " + stringList.size());

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Nesrin");
        stringHashSet.add("Ayşe");
        stringHashSet.add(new String("Doruk"));
        stringHashSet.add(new String("Doruk"));

        HashSet<Ogretmen> ss = new HashSet<>();
        ss.add(new Ogretmen());
        ss.add(new Ogretmen());


        for (String isim : stringHashSet) {
            System.out.println("hashset içeirsindeki isim: " + isim);
        }
        System.out.println("hashset uzunluğu: " + stringHashSet.size());


//        System.out.println("hashsetin uzunluğu:" + stringHashSet.size());
//
//        stringHashSet.add("Nesrin");
//
//        System.out.println("hashsetin uzunluğu:" + stringHashSet.size());//aynı veriden bir adet daha eklerrsem ne olur?

    }
}
