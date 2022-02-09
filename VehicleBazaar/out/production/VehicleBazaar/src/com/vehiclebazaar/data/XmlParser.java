package com.vehiclebazaar.data;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlParser {



    public static void xmlHandler() throws JAXBException {
        File file = new File("C:\\Users\\PRANEET\\IdeaProjects\\VehicleBazaar\\src\\vehicle.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicle.class);
        Unmarshaller unmarshaller =  jaxbContext.createUnmarshaller();
        Vehicle vehicle = (Vehicle) unmarshaller.unmarshal(file);
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getColour());



    }
    //Unmarshaller unmarshaller = (Unmarshaller) jaxbContext.createUnmarshaller();
        //Car car = (Car) unmarshaller.unmarshal(file);



}
