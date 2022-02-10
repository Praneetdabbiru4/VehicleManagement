package com.vehiclebazaar.data;
import jakarta.xml.bind.annotation.*;
@XmlRootElement (name = "vehicle")
@XmlAccessorType (XmlAccessType.FIELD)
public class Vehicle {
    private  String vehicleType;
    private  String brakeType;
    private  int numberOfSeats;
    private  int horsePower;
    // properties
    private String brand;
    private String fuelType;
    private String model;
    private int maximumSpeed;
    private String colour;
    private int price;
    private String review;
    private int mileage;

    //methods

    public Vehicle(){

    }
    public Vehicle(String vehicleType, String brand, String model, String colour, String fuelType, int price, int maximumSpeed, String review, int horsePower, int numberOfSeats, String brakeType, int mileage){
        this.vehicleType= vehicleType;
        this.brand = brand;
        this.model= model;
        this.colour = colour;
        this.fuelType= fuelType;
        this.price= price;
        this.maximumSpeed = maximumSpeed;
        this.review = review;
        this.horsePower = horsePower;
        this.numberOfSeats = numberOfSeats;
        this.brakeType = brakeType;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBrakeType() {
        return brakeType;
    }
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower= horsePower;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}
