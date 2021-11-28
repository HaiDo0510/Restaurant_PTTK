package com.restaurant.dao;

import java.util.Date;

import com.restaurant.model.TKDoanhThu;

public interface TKDoanhThuDAO {
  public TKDoanhThu getTKDoanhThuByGio(int khungGio, Date ngayBatDau,
      Date ngayKetThuc);
}
