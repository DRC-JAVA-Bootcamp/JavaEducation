package com.egitim.ucuncuhafta.cmt.polimorfizm;

import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Flower;
import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.FlowerBase;
import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Karpuz;
import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Rose;
import com.egitim.ucuncuhafta.cmt.polimorfizm.flowerpolimorfiz.FlowerService;

public class Downcasting {

    public static void main(String[] args) {
        /**
         * primitve type'larda gördüğümüz gibi birbirinden kalıtım alan sınıflar üzerinde de upcasting, downcasting işlemleri yapılabilir.
         *
         */

        //Upcasting: bir nesnenin refreansını bir üst nesneye atama işlemidir.
        //UpCastingte client gerçek nesneyi bilmek zorunda kalmadan işlem yapabilir.
        //polymorfizm sadece nesneler üzerinde olmaz. methodlarda olur. farklı imp. olan methodlar örnek.
        // Flower flower = new Rose("Red");

        //Downcasting
        //    Rose rose = new Flower("blue"); // bu şekilde downcasting yapamam.

        /**
         * birinci tip downcasting yöntemi.
         */
        //   Flower flowerr = (Rose) new Flower("Blue");
        // System.out.println(flowerr);


       // Flower flower2 = new Flower();
       // Rose flower21 = (Rose) flower2;
        //   flower21.smell();


        /**
         * ikinci tip downcasting yöntemi.
         */
        Flower flower1 = new Rose("red");
        flower1.smell();
        Flower flowerKarpuz = new Karpuz("red");
        FlowerService flowerService = new FlowerService();
        flowerService.smell(flower1);
        flowerService.smell(flowerKarpuz);

        //upcasting işleminde hiyerarşi önceliği önemlidir.
        Rose rose = new Rose("");
        if (rose instanceof Flower) {
            System.out.println("");
        } else if (rose instanceof FlowerBase) {
            System.out.println("");
        }

        if (rose instanceof FlowerBase) {
            System.out.println("flowerbase içerisine girer");
        } else if (rose instanceof Flower) {
            System.out.println("");
        }
    }


}
