/**
 * MySqlMultipleInserts.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.util.*;
import java.sql.*;
public class MySQLMultipleInsert {
  public static void main(String [] args) {
    Connection con = null;
    try {

// Setting up the DataSource object
      com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds 
        = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
      ds.setServerName("localhost");
      ds.setPortNumber(3306);
      ds.setDatabaseName("test");
//      ds.setUser("Herong");
//      ds.setPassword("TopSecret");

// Getting a connection object and statement object
      con = ds.getConnection();
      Statement sta = con.createStatement(); 
      int count = 0;

// insert a single row using default values
      count += sta.executeUpdate(
        "INSERT INTO Profile"
        + " (FirstName)"
        + " VALUES ('Herong')");

// insert a single row using provided values
      count += sta.executeUpdate(
        "INSERT INTO Profile"
        + " (FirstName, LastName, Point, BirthDate)"
        + " VALUES ('Janet', 'Gates', 999.99, '1984-10-13')");

// insert rows with loop with random values
      Random r = new Random();
      for (int i=0; i<10; i++) {
      	Float points = 1000*r.nextFloat();
      	String firstName = Integer.toHexString(r.nextInt(9999));
      	String lastName = Integer.toHexString(r.nextInt(999999));
        count += sta.executeUpdate(
          "INSERT INTO Profile"
          + " (FirstName, LastName, Point)"
          + " VALUES ('"+firstName+"', '"+lastName+"', "+points+")");
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
