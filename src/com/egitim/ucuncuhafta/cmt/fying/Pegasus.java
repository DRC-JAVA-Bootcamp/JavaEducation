package com.egitim.ucuncuhafta.cmt.fying;

public class Pegasus extends Plane implements IAbroadFoodChoise{

    boolean isCurrentPassengerBusiness;
    private final int businessAddFare = 500;

    @Override
    public int takeTicket(int personCount) {
        int takeTicket = super.takeTicket(personCount);
        if(isCurrentPassengerBusiness){
            takeTicket = takeTicket + businessAddFare;
        }

        return takeTicket;
    }

    public boolean isIsbusiness() {
        return isCurrentPassengerBusiness;
    }

    public void setIsbusiness(boolean isbusiness) {
        this.isCurrentPassengerBusiness = isbusiness;
    }

    @Override
    public void foodChoise() {
        System.out.println("Pegasus et ürünleri ikramında bulunur.");
    }
}
