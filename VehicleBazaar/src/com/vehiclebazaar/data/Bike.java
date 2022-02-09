package com.vehiclebazaar.data;

public class Bike extends Vehicle{


    private int power;
    private String brakeType;
    private String tyreType;

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


}
