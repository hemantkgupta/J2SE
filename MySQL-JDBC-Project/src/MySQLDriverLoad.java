/**
 * MySqlLoadDriver.java
 * Copyright (c) 2007 by Dr. Herong Yang. All rights reserved.
 */
import java.sql.*;
public class MySQLDriverLoad {
  public static void main(String [] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver") ;
      System.out.println("MySQL JDBC driver loaded ok.");
      String url = "jdbc:mysql://localhost:3306/";
      Connection conn = DriverManager.getConnection(url,"root","root");
      Statement stmt = conn.createStatement();
      stmt.executeUpdate("DROP DATABASE IF EXISTS MYTEST");
      stmt.executeUpdate("CREATE DATABASE MYTEST");
      stmt.executeUpdate ("DROP TABLE IF EXISTS MYTEST.PRODUCT");
      stmt.executeUpdate("CREATE TABLE MYTEST.PRODUCT(id INTEGER, name VARCHAR(254))");
      stmt.executeUpdate("INSERT INTO MYTEST.PRODUCT(id , name)VALUES (11,'asd')");
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}