/**
 * OracleMultipleInserts.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.util.*;
import java.sql.*;
public class OracleMultipleInserts {
  public static void main(String [] args) {
    Connection con = null;
    try {

// Setting up the DataSource object
      oracle.jdbc.pool.OracleDataSource ds 
        = new oracle.jdbc.pool.OracleDataSource();
      ds.setDriverType("thin");
      ds.setServerName("64.104.145.224");
      ds.setPortNumber(1521);
      ds.setDatabaseName("orcl"); // Oracle SID
      ds.setUser("HR");
      ds.setPassword("hr");

// Getting a connection object and statement object
      con = ds.getConnection();
      Statement sta = con.createStatement(); 
      int count = 0;

// insert a single row using default values
      count += sta.executeUpdate(
        "INSERT INTO Profile"
        + " (ID, FirstName)"
        + " VALUES (1, 'Herong')");

// insert a single row using provided values
      count += sta.executeUpdate(
        "INSERT INTO Profile"
        + " (ID, FirstName, LastName, Point, BirthDate)"
        + " VALUES (2, 'Janet', 'Gates', 999.99, '13-Oct-1984')");

// insert rows with loop with random values
      Random r = new Random();
      for (int i=0; i<10; i++) {
      	Float points = 1000*r.nextFloat();
      	String firstName = Integer.toHexString(r.nextInt(9999));
      	String lastName = Integer.toHexString(r.nextInt(999999));
        count += sta.executeUpdate(
          "INSERT INTO Profile"
          + " (ID, FirstName, LastName, Point)"
          + " VALUES ("+(i+10)+", '"+firstName+"', '"+lastName+"', "
          + points+")");
      }

// How many rows were inserted
      System.out.println("Number of rows inserted: "+count);

// Checking inserted rows
      ResultSet res = sta.executeQuery(
        "SELECT * FROM Profile");
      System.out.println("List of Profiles: "); 
      while (res.next()) {
         System.out.println(
           "  "+res.getInt("ID")
           + ", "+res.getString("FirstName")
           + ", "+res.getString("LastName")
           + ", "+res.getDouble("Point")
           + ", "+res.getDate("BirthDate")
           + ", "+res.getTimestamp("ModTime"));
      }
      res.close();

      sta.close();
      con.close();
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}
