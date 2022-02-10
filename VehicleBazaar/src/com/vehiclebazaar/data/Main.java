package com.vehiclebazaar.data;

import com.vehiclebazaar.db.Database;

import java.util.List;
import java.sql.*;

//import org.w3c.dom.Document;
//import org.w3c.dom.Element;


public class Main {
    public static void main() throws Exception {

        List<Vehicle> vehicles =XmlParser.getVehicle();
        System.out.println("--------------------------------------------------------");

        Database.sendDatabase(vehicles);

    }
}









