/**
 * MySqlAutoIncrement.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.sql.*;
import javax.sql.*;
public class MySQLAutoIncrement {
  public static void main(String [] args) {
    Connection con = null;
    try {
    	
// Setting up the DataSource object
      com.mysql.jdbc.jdbc2.optional.MysqlDataSource ds 
        = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
      ds.setServerName("localhost");
      ds.setPortNumber(3306);
      ds.setDatabaseName("test");
//      ds.setDatabaseName("HerongDB");
//      ds.setUser("Herong");
//      ds.setPassword("TopSecret");

// Getting a connection object
      con = ds.getConnection();

// Creating a database table
      Statement sta = con.createStatement(); 
      int count = sta.executeUpdate(
        "CREATE TABLE Profile ("
        + " ID INTEGER PRIMARY KEY AUTO_INCREMENT,"
        + " FirstName VARCHAR(20) NOT NULL,"
        + " LastName VARCHAR(20),"
        + " Point REAL DEFAULT 0.0,"
        + " BirthDate DATE DEFAULT '1988-12-31',"
        + " ModTime TIMESTAMP DEFAULT '2006-12-31 23:59:59.999')");
      System.out.println("Table created.");
      sta.close();        

      con.close();        
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}
