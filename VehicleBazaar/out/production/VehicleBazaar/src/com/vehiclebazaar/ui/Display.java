package com.vehiclebazaar.ui;

import java.util.List;

import com.vehiclebazaar.data.*;
public class Display {
      /* public static void printVehicleCar(Car car) {
    	System.out.println("Company name\t" +car.getBrand());
    	System.out.println("Fuel type\t" +car.getFuelType());
    	System.out.println("Color\t"+car.getColor());
    	System.out.println("Price\t"+car.getPrice());
    	System.out.println("Maximum speed\t" +car.getMaximumSpeed());
    	System.out.println("Horse power\t"+car.getHorsePower());
    	System.out.println("Model\t"+car.getModel());
    	System.out.println("Customer Reviews\t"+car.getReviews());
       }*/

      /* public static void printVehicleBike(Bike bike) {
       	System.out.println("Company name\t" +bike.getBrand());
       	System.out.println("Fuel type\t" +bike.getFuelType());
       	System.out.println("Color\t"+bike.getColor());
       	System.out.println("Price\t"+bike.getPrice());
       	System.out.println("Maximum speed\t" +bike.getMaximumSpeed());
       	System.out.println("Horse power\t"+bike.getPower());
       	System.out.println("Model\t"+bike.getModel());
       	System.out.println("Customer Reviews\t"+bike.getReviews());
          } */

    public static void printVehicle(List<Vehicle> vehicle) {
        for (Vehicle vehicles : vehicle) {
            System.out.println("Company name\t" +vehicles.getBrand());
            System.out.println("Model\t"+vehicles.getModel());
            System.out.println("Fuel type\t" +vehicles.getFuelType());
            System.out.println("Colour\t"+vehicles.getColour());
            System.out.println("Price\t"+"Rupees(INR) "+vehicles.getPrice());
            System.out.println("Maximum speed\t" +vehicles.getMaximumSpeed()+ " kph");

            System.out.println("Mileage\t"+ vehicles.getMileage()+" kmpl");
            System.out.println("Customer Review\t"+vehicles.getReview());

            if(vehicles instanceof Car) {
                Car car = (Car) vehicles;

                System.out.println("Horse power\t"+car.getHorsePower()+"cc");
                System.out.println("Transmission type\t"+car.getTransmissionType());
                System.out.println("Number of seats\t"+car.getNumberOfSeats());
                System.out.println("---------------------------------------------");
            }else if(vehicles instanceof Bike) {
                Bike bike = (Bike)vehicles;

                System.out.println("Horse power\t"+bike.getPower()+" cc");

                System.out.println("Brake type\t"+bike.getBrakeType());
                System.out.println("Tyre type\t"+bike.getTyreType());
                System.out.println("---------------------------------------------");

            }
        }
    }

}
