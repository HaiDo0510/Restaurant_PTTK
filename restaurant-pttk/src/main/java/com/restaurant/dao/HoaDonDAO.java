package com.restaurant.dao;

import java.util.Date;
import java.util.List;

import com.restaurant.model.HoaDon;

public interface HoaDonDAO {
  public List<HoaDon> getAllByDate(Date ngayBatDau, Date ngayKetThuc);
  
  public List<HoaDon> getAllByDateAndKG(Integer khungGio, Date ngayBatDau, Date ngayKetThuc);
}
