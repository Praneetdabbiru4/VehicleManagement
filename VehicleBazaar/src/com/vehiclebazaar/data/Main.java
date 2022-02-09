package com.vehiclebazaar.data;

import com.vehiclebazaar.db.Database;
//import java.sql.*;

//import org.w3c.dom.Document;
//import org.w3c.dom.Element;


public class Main {
    public static void main() throws Exception {

        XmlParser.xmlHandler();
        Database.sendDatabase();


    }
}









