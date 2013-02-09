/**
 * OracleDataSource.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.sql.*;

public class OracleDataSource {
  public static void main(String [] args) {
    Connection con = null;
    try {

// Setting up the DataSource object
      oracle.jdbc.pool.OracleDataSource ds 
        = new oracle.jdbc.pool.OracleDataSource();
      ds.setDriverType("thin");
      ds.setServerName("127.0.0.1");
      ds.setPortNumber(1521);
      ds.setDatabaseName("orcl"); // Oracle SID
      ds.setUser("HR");
      ds.setPassword("hr");

// Getting a connection object
      con = ds.getConnection();
      
// Getting database info
      DatabaseMetaData meta = con.getMetaData();
      System.out.println("Server name: " 
        + meta.getDatabaseProductName());
      System.out.println("Server version: "
        + meta.getDatabaseProductVersion());

// Getting the connection URL back
      System.out.println("Connection URL: "+ds.getURL());

// Closing the connection
      con.close();
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
      e.printStackTrace();
    }
  }
}