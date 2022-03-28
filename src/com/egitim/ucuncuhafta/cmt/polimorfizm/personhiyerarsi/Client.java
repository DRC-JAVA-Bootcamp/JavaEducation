package com.egitim.ucuncuhafta.cmt.polimorfizm.personhiyerarsi;

public class Client {
    public static void main(String[] args) {

//        System.out.println("Engineer maaşı hesapla");
//        Engineer engineer = new Engineer();
//        engineer.setCalistigiYil(2);
//        int engineerSalary = engineer.maasHesapla();
//        System.out.println("Engineer maaşı hesaplandı:" + engineerSalary);
//
//        System.out.println();
//        Manager manager = new Manager();
//        manager.setCalistigiYil(2);
//        int managerSalary = manager.maasHesapla();
//        System.out.println("Manager maaşı hesaplandı:" + managerSalary);
//
//        Accountant accountant = new Accountant();
//        accountant.setCalistigiYil(3);
//        int salary = accountant.maasHesapla();
//        System.out.println("Accountant salary: " + salary);


        /**
         * polimorfizimden faydalanalım.
         */
        //yeni bir departman açıldı ve doktorun maaşının hesaplanması gerekiyor.
//        Employee employee1 = new Engineer();
//        employee1.setCalistigiYil(20);
//        employee1.maasHesapla();
//
//        Employee engineer1 = new Manager();
//        engineer1.setCalistigiYil(1);
//        int maas = engineer1.maasHesapla();
//        System.out.println("engineer maaş:" + maas);




        MaasHesaplamaService maasHesaplamaService = new MaasHesaplamaService();

        Manager manager2 = new Manager();
       // maasHesaplamaService.maasHesapla(manager2);

        Engineer engineer2 = new Engineer();
    //    maasHesaplamaService.maasHesapla(engineer2);

        maasHesaplamaService.maasHesapla(manager2);
        maasHesaplamaService.maasHesapla(engineer2);





    }

}
