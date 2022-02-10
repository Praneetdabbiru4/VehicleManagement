package com.vehiclebazaar;

import java.util.ArrayList;
import java.util.List;
import com.vehiclebazaar.data.Main;

import com.vehiclebazaar.data.*;
import com.vehiclebazaar.db.Database;
import com.vehiclebazaar.ui.*;
import jakarta.xml.bind.JAXBException;

public class VehicleBazaarMain {

    public static void main(String[]args) throws Exception {


        Car car = new Car();
        Bike bike = new Bike();
        //Display display = new Display();
        System.out.println("---------------------------Welcome to Vehiclebazaar.com----------------------");



        car.setBrand("Tata");
        car.setModel("Sumo");
        car.setColour("white");
        car.setFuelType("Diesel");
        car.setPrice(2000000);
        car.setMaximumSpeed(200);
        car.setReview("good");
        car.setHorsePower(130);
        car.setMileage(15);
        car.setTransmissionType("Manual");
        car.setNumberOfSeats(7);
        //Display.printVehicle( (List<VehicleInfo>)car);

        bike.setBrand("Bajaj");
        bike.setModel("Vikrant");
        bike.setColour("black");
        bike.setFuelType("Petrol");
        bike.setPrice(100000);;
        bike.setMaximumSpeed(180);
        bike.setReview("good");
        bike.setPower(80);
        bike.setMileage(57);
        bike.setBrakeType("Double Disc");
        bike.setTyreType("Tubeless");
        //Display.printVehicle((List<VehicleInfo>) bike);
		/*VehicleInfo vehicles[] = new VehicleInfo[2];
		vehicles[0]= car;
		vehicles[1]= bike;*/

        //Main.main();

        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(car);
        list.add(bike);


        Display.printVehicle(list);

        List<Vehicle> vehicles =XmlParser.getVehicle();
        System.out.println("--------------------------------------------------------");

        Database.sendDatabase(vehicles);
        GenerateVehicleOutput.printVehicleOutput(vehicles);


    }


}
