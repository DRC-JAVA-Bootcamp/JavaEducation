package com.egitim.ucuncuhafta.cmt.polimorfizm.personhiyerarsi;

public class MaasHesaplamaService {

//    public void maasHesapla(Manager manager) {
//        manager.setCalistigiYil(5);
//        int managerSalary = manager.maasHesapla();
//        System.out.println("Manager salary: " + managerSalary);
//    }

//    public void maasHesapla(Engineer engineer) {
//        engineer.setCalistigiYil(6);
//        int engineerSalary = engineer.maasHesapla();
//        System.out.println("Engineer salary: " + engineerSalary);
//    }

    public void maasHesapla(Employee employee){
        employee.setCalistigiYil(6);
        int employeeMaas = employee.maasHesapla();
        System.out.println("Employee salary: " + employeeMaas);

    }
}
