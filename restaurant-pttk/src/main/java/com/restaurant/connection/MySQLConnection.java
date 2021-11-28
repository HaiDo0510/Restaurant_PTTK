package com.restaurant.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySQLConnection {
  private Connection con;

  public MySQLConnection() throws InstantiationException,
      IllegalAccessException, ClassNotFoundException, SQLException {

    ResourceBundle rs = ResourceBundle.getBundle("SystemConfig");

    Class.forName(rs.getString("dbdriver")).newInstance();
    con = DriverManager.getConnection(
        rs.getString("dblink") + rs.getString("dbusingcharacterset"),
        rs.getString("dbusername"), rs.getString("dbpassword"));
  }

  public void closeConnection() throws SQLException {
    con.close();
  }

  public Connection getCon() {
    return con;
  }

  public void setCon(Connection con) {
    this.con = con;
  }

}