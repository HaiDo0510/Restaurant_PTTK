package com.restaurant.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.restaurant.connection.MySQLConnection;
import com.restaurant.dao.HoaDonDAO;
import com.restaurant.model.HoaDon;

public class HoaDonDAOImlp implements HoaDonDAO {

  @Override
  public List<HoaDon> getAllByDate(Date ngayBatDau, Date ngayKetThuc) {
    List<HoaDon> hoaDons = new ArrayList<>();
    MySQLConnection mCon;
    try {
      mCon = new MySQLConnection();
      String sql = "select * from hoadon h where h.ngay >= ? and h.ngay <= ?";
      PreparedStatement ps = mCon.getCon().prepareStatement(sql);
      ps.setDate(1, new java.sql.Date(ngayBatDau.getTime()));
      ps.setDate(2, new java.sql.Date(ngayKetThuc.getTime()));
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        hoaDons.add(new HoaDon(rs.getInt(1), rs.getDate(2), rs.getInt(3),
            rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),
            rs.getInt(8), rs.getInt(9)));
      }
      mCon.closeConnection();
    } catch (InstantiationException | IllegalAccessException
        | ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }

    return hoaDons;
  }

  @Override
  public List<HoaDon> getAllByDateAndKG(Integer khungGio, Date ngayBatDau,
      Date ngayKetThuc) {
    List<HoaDon> hoaDons = new ArrayList<>();
    MySQLConnection mCon;
    try {
      mCon = new MySQLConnection();
      String sql = "select * from hoadon h where h.ngay >= ? and h.ngay <= ? and ? >= giobatdau and ? <= gioketthuc";
      PreparedStatement ps = mCon.getCon().prepareStatement(sql);
      ps.setDate(1, new java.sql.Date(ngayBatDau.getTime()));
      ps.setDate(2, new java.sql.Date(ngayKetThuc.getTime()));
      ps.setInt(3, khungGio);
      ps.setInt(4, khungGio);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        hoaDons.add(new HoaDon(rs.getInt(1), rs.getDate(2), rs.getInt(3),
            rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),
            rs.getInt(8), rs.getInt(9)));
      }
      mCon.closeConnection();
    } catch (InstantiationException | IllegalAccessException
        | ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }

    return hoaDons;
  }

//  public static void main(String[] args) throws ParseException {
//    Date ngayBatDau = new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-25");
//    Date ngayKetThuc = new SimpleDateFormat("yyyy-MM-dd").parse("2021-11-26");
//    System.out.println("hello hai========");
//    List<HoaDon> list = new HoaDonDAOImlp().getAllByDateAndKG(7, ngayBatDau, ngayKetThuc);
//    System.out.println(list.size());
//    for(HoaDon h:list) {
//      System.out.println(h.toString());
//    }
//  }

}
