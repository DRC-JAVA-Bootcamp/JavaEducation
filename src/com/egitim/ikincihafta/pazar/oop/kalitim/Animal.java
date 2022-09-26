package com.egitim.ikincihafta.pazar.oop.kalitim;

public abstract class Animal {

    private String name;

    public void feed(){
        System.out.println("Animal is fed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
