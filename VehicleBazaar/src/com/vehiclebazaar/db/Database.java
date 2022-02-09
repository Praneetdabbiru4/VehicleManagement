package com.vehiclebazaar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void sendDatabase() throws Exception {
        try {
            String username = "root";
            String password = "Pranit@123";
            String url = "jdbc:mysql://localhost:3306/vehiclebazaar";

            String Query = "Insert into vehicle (vehicleType,brand,model,colour,fuelType,price,maximumSpeed,review,horsePower,numberOfSeats,brakeType) values ('Car','Hyundai','i10','White','Petrol',500000,220,'good',130,5,null)";
            String Query1 = "Select * from vehicle";

            //Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            //ResultSet rc = st.executeQuery(Query1);
            st.executeUpdate(Query);


               /* while(rc.next()) {
                    System.out.println(rc.getString(1)
                    + " " + rc.getString(2););
                }*/
               /* while(rc.next()) {
                    System.out.println(rc.getString(1) + " "+ rc.getString(2)+ " "+rc.getString(3)
                    +" "+ rc.getString(4)+ " "+ rc.getString(5)+ " "+ rc.getInt(6)+ " "+ rc.getInt(7)
                    + " "+ rc.getString(8)+ " "+ rc.getInt(9)+ " "+ rc.getInt(10)+ " "+ rc.getString(11));

                }*/
            con.close();


        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}

