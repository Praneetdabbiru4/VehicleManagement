package com.vehiclebazaar.data;
import jakarta.xml.bind.annotation.*;
@XmlRootElement
public class Vehicle {
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
    @XmlElement
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @XmlElement
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @XmlElement
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @XmlElement
    public int getMaximumSpeed() {
        return maximumSpeed;
    }
    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
    @XmlElement
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    @XmlElement
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @XmlElement
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    @XmlElement
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}
