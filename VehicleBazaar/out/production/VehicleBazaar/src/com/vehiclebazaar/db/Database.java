package com.vehiclebazaar.db;

import com.vehiclebazaar.data.Vehicle;
import com.vehiclebazaar.data.Vehicles;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
   /* public static void sendDatabase() throws Exception {
        try {
            String username = "root";
            String password = "Pranit@123";
            String url = "jdbc:mysql://localhost:3306/vehiclebazaar";

            String Query = "Insert into vehicle (vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType) values ('Car','Tata','i10','White','Petrol',500000,220,'good',130,5,null)";
            String Query1 = "Select * from vehicle";

            //Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rc = st.executeQuery(Query1);
            st.executeUpdate(Query);



            con.close();


        } catch (Exception e) {
                e.printStackTrace();
        }
    }*/
    public static List<Vehicle> getVehicle() throws SQLException {
        String username = "root";
        String password = "Pranit@123";
        String url = "jdbc:mysql://localhost:3306/vehiclebazaar";
        List<Vehicle> vehicles = new ArrayList<>();
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rc = st.executeQuery("Select * from vehicle");

//vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType
        while(rc.next()){
            String vehicleType = rc.getString("vehicleType");
            String brand = rc.getString("brand");
            String model = rc.getString("model");
            String colour = rc.getString("colour");
            String fuelType = rc.getString("fuelType");
            int price = rc.getInt("price");
            int maximumSpeed = rc.getInt("maximumSpeed");
            String review = rc.getString("review");
            int horsePower = rc.getInt("horsePower");
            int numberOfSeats = rc.getInt("numberOfSeats");
            String brakeType = rc.getString("brakeType");
            int mileage = Integer.parseInt(rc.getString("mileage"));
            vehicles.add(new Vehicle(vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType,mileage));
        }
        con.close();
        return vehicles;
    }

    public  static  void sendDatabase( List<Vehicle> vehicles) throws SQLException {
        String username = "root";
        String password = "Pranit@123";
        String url = "jdbc:mysql://localhost:3306/vehiclebazaar";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        for(Vehicle vehicle: vehicles){
            String Query = String.format("Insert into vehicle (vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType) values ('Car','Tata','i10','White','Petrol',500000,220,'good',130,5,null)");

            st.executeUpdate(Query);
        }
    }
}

