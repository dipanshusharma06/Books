package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static final String LOAD_DRIVER= "org.postgresql.Driver";
    private static final String URL= "jdbc:postgresql://localhost:5432/Book";
    private static final String USERNAME="your username";
    private static final String PASSWORD="your password";

    public static Connection getDbConnection(){
        Connection conn = null;
        try{
            Class.forName(LOAD_DRIVER);
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
