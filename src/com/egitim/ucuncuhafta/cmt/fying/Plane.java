package com.egitim.ucuncuhafta.cmt.fying;

public abstract class Plane {
    int passengerCount;
    int capacity;
    int fare;

    public int takeTicket(int personCount){
        int ticketFare = personCount * fare;
        return ticketFare;

    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
