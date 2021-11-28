package com.restaurant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.restaurant.connection.MySQLConnection;
import com.restaurant.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO {

  @Override
  public boolean checkAccount(String username, String password) {
    String expect_password = "";
    try {
      MySQLConnection conn = new MySQLConnection();
      Connection co = conn.getCon();
      String sql = "select t.password from thanhvien t "
          + "join nhanvien v on v.thanhvien_id = t.id "
          + "where username = ? and v.vitri = 'quanly'";
      PreparedStatement psmt = co.prepareStatement(sql);
      psmt.setString(1, username);
      ResultSet rs = psmt.executeQuery();
      if (rs.next()) expect_password = rs.getString("password");
      psmt.close();
      conn.closeConnection();
    } catch (Exception ex) {
      System.out.println(ex);
    }
    return expect_password.equals(password);
  }

}
