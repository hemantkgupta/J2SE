/**
 * OracleCreateTable.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.sql.*;

public class OracleCreateTable {
  public static void main(String [] args) {
    Connection con = null;
    try {

// Setting up the DataSource object
      oracle.jdbc.pool.OracleDataSource ds 
        = new oracle.jdbc.pool.OracleDataSource();
      ds.setDriverType("thin");
      ds.setServerName("127.0.0.1");
      ds.setPortNumber(1521);
      ds.setDatabaseName("orcl");
      ds.setUser("HR");
      ds.setPassword("hr");

// Getting a connection object
      con = ds.getConnection();

// Creating a database table
      Statement sta = con.createStatement(); 
      int count = sta.executeUpdate(
        "CREATE TABLE Profile ("
        + " ID INTEGER PRIMARY KEY,"
        + " FirstName VARCHAR(20) NOT NULL,"
        + " LastName VARCHAR(20),"
        + " Point REAL DEFAULT 0.0,"
        + " BirthDate DATE DEFAULT '31-Dec-1988',"
        + " ModTime TIMESTAMP DEFAULT '31-Dec-2006 11:59:59.999')");
      System.out.println(count);
      System.out.println("Table created.");
      sta.close();

      con.close();        
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}