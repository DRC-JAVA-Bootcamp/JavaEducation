package com.egitim.ucuncuhafta.cmt.fying;

public class TicketService {

//    Plane plane;
//
//    public TicketService(Plane plane){
//        this.plane = plane;
//    }


//    public void takeTicketForPassenger(int countPerson){
//        int takeTicketFare = plane.takeTicket(countPerson);
//        System.out.println("total fare: " + takeTicketFare);
//
//    }


    public void takeTicketForPassenger(Plane plane, int countPerson){
        int takeTicketFare = plane.takeTicket(countPerson);
        System.out.println("total fare: " + takeTicketFare);

    }

    public void takeTicketForPassenger(Plane plane, int countPerson, boolean isBusiness){
        int takeTicketFare = plane.takeTicket(countPerson);
        System.out.println("total fare: " + takeTicketFare);

    }

}
