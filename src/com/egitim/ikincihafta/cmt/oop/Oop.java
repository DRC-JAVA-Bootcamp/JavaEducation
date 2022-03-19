package com.egitim.ikincihafta.cmt.oop;

public class Oop {

    /**
     * Class'lar bizim için şablondur.
     * Bu classları ele alarak oluşturduğumuz örneklemelerden nesneleri oluştururuz.
     * Ogretmen classında adı, maası gibi alanları vardır. Bu tüm öğretmenler için geçerli bir şablondur
     * Ogretmen classından adı Ahmet olan 7000lira maaşı olan özel bir öğretmen oluşturabiliriz.
     * İşte bu şekilde Ogretmen classından bir örnekleme bir nesne oluşturmuş olduk.
     * Nesne olan somut olanı temsil eder.
     */
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen(true);
        ogretmen.adi = "Nesrin";
        ogretmen.yasi = 25;
      //  ogretmen.getOgrenci();


        Ogretmen ogretmen3 = new Ogretmen("Math");



    }

    /**
     * Nesneler state'lere ve behavior'a sahiptir.
     * Methodlar olarak bilinen behavior'ın yapısı
     */

    /**
     * method adı: okulaGit
     * method return type: void
     * method parametresi: isim
     * @param isim
     */
    public void okulaGit(String isim){


    }

    public int toplamaIslemi(int ilkSayi, int ikinciSayi){
        int toplam = ilkSayi + ikinciSayi;
        return toplam;
    }


}
