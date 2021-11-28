package com.restaurant.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.restaurant.dao.TKDoanhThuDAO;
import com.restaurant.model.HoaDon;
import com.restaurant.model.TKDoanhThu;

public class TKDoanhThuDAOImpl implements TKDoanhThuDAO {

  @Override
  public TKDoanhThu getTKDoanhThuByGio(int khungGio, Date ngayBatDau,
      Date ngayKetThuc) {
    List<HoaDon> lHoaDons = new HoaDonDAOImlp().getAllByDateAndKG(khungGio,
        ngayBatDau, ngayKetThuc);
    TKDoanhThu tkDoanhThu = new TKDoanhThu();
    int tongKhach = 0;
    long doanhThuTong = 0;
    for (HoaDon h : lHoaDons) {
      tongKhach += h.getSokhach();
      doanhThuTong += h.getTongtien();
    }

    long getDiff = ngayKetThuc.getTime() - ngayBatDau.getTime();
    long soNgay = getDiff / (24 * 60 * 60 * 1000);

    tkDoanhThu.setLuongKhach(tongKhach);
    tkDoanhThu.setDoanhThuTong(doanhThuTong);
    tkDoanhThu.setDoanhThuTrenMotKhach(
        doanhThuTong / (tongKhach == 0 ? 1 : tongKhach));
    tkDoanhThu.setLuongKhachTB((int) (tongKhach / (soNgay == 0 ? 1 : soNgay)));
    return tkDoanhThu;
  }

//  public static void main(String[] args) throws ParseException {
//    Date ngayBatDau = new SimpleDateFormat("yyyy-MM-dd").parse("2021-11-01");
//    Date ngayKetThuc = new SimpleDateFormat("yyyy-MM-dd").parse("2021-11-30");
//    long getDiff =  ngayKetThuc.getTime() - ngayBatDau.getTime();
//    long soNgay = getDiff / (24 * 60 * 60 * 1000);
//    System.out.println("so ngay: "+soNgay);
//  }

}
