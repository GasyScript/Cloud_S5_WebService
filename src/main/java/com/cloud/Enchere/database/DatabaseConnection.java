package com.cloud.Enchere.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String driver = "org.postgresql.Driver"; 
    private static final String url = "postgresql://postgres:X78wfP2I133zTL42Juke@containers-us-west-196.railway.app:7978/railway"; 
    private static final String username = "postgres"; 
    private static final String pwd = "X78wfP2I133zTL42Juke";

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,username,pwd);
        
        return con;
    }
}
