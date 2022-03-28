package com.egitim.ucuncuhafta.cmt.fying;

import java.util.Scanner;

public class TicketRezervation {

    public static void main(String[] args) {
        Plane thy = new THY();
        thy.setCapacity(100);
        thy.setFare(200);
        thy.setPassengerCount(0);

        Plane pegasus = new Pegasus();
        pegasus.setCapacity(230);
        pegasus.setFare(300);
        pegasus.setPassengerCount(0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
//        TicketService ticketService = new TicketService(thy);
//        TicketService ticketServicePegasus = new TicketService(pegasus);
        TicketService ticketService = new TicketService();
        while (true){
            System.out.println("THY ile uçuş yapmak istiyorsanız T'ye Pegasus ile uçmak istiyoraanız P tuşuna basınız.");
            System.out.println("Çıkış yapmak için çıkış butonun basınız.");
            String next = scanner.next();
            if(next.equalsIgnoreCase("T")){
                ticketService.takeTicketForPassenger(thy,2);
            }else if(next.equalsIgnoreCase("P")){
                System.out.println("Business bilet için lütfen Yes butonuna basınız");
                String nextBusiness = scanner.next();
                Pegasus pegasus1 = (Pegasus) pegasus;
                pegasus1.foodChoise();
                if(nextBusiness.equalsIgnoreCase("Yes")){
                    pegasus1.setIsbusiness(true);
                }else {
                    pegasus1.setIsbusiness(false);
                }
                ticketService.takeTicketForPassenger(pegasus, 3);
            } else if(next.equalsIgnoreCase("çıkış")){
                return;
            }
        }
    }

}
