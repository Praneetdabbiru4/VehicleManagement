package com.vehiclebazaar.data;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class XmlParser {



    /*public static void xmlHandler() throws JAXBException {
        File file = new File("C:\\Users\\PRANEET\\IdeaProjects\\VehicleBazaar\\src\\vehicle.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicles.class);
        Unmarshaller unmarshaller =  jaxbContext.createUnmarshaller();
        Vehicles vehicles = (Vehicles) unmarshaller.unmarshal(file);
        System.out.println(vehicles.getBrand());
        System.out.println(vehicles.getModel());
        System.out.println(vehicles.getColour());*/
    public static List<Vehicle> getVehicle() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicles.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Vehicles vehicles = (Vehicles) unmarshaller.unmarshal(new File("C:\\Users\\PRANEET\\IdeaProjects\\VehicleBazaar\\src\\vehicle.xml"));
        List<Vehicle> vehicleList = vehicles.getVehicles();
        return vehicleList;
    }



    }
    //Unmarshaller unmarshaller = (Unmarshaller) jaxbContext.createUnmarshaller();
        //Car car = (Car) unmarshaller.unmarshal(file);




