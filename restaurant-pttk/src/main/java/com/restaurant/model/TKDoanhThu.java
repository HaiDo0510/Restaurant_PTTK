package com.restaurant.model;

public class TKDoanhThu {
  private Integer luongKhach;
  private Integer luongKhachTB;
  private Long doanhThuTrenMotKhach;
  private Long doanhThuTong;

  public TKDoanhThu() {
    super();
  }

  public TKDoanhThu(Integer luongKhach, Integer luongKhachTB,
      Long doanhThuTrenMotKhach, Long doanhThuTong) {
    super();
    this.luongKhach = luongKhach;
    this.luongKhachTB = luongKhachTB;
    this.doanhThuTrenMotKhach = doanhThuTrenMotKhach;
    this.doanhThuTong = doanhThuTong;
  }

  public Integer getLuongKhach() {
    return luongKhach;
  }

  public void setLuongKhach(Integer luongKhach) {
    this.luongKhach = luongKhach;
  }

  public Integer getLuongKhachTB() {
    return luongKhachTB;
  }

  public void setLuongKhachTB(Integer luongKhachTB) {
    this.luongKhachTB = luongKhachTB;
  }

  public Long getDoanhThuTrenMotKhach() {
    return doanhThuTrenMotKhach;
  }

  public void setDoanhThuTrenMotKhach(Long doanhThuTrenMotKhach) {
    this.doanhThuTrenMotKhach = doanhThuTrenMotKhach;
  }

  public Long getDoanhThuTong() {
    return doanhThuTong;
  }

  public void setDoanhThuTong(Long doanhThuTong) {
    this.doanhThuTong = doanhThuTong;
  }

  @Override
  public String toString() {
    return "TKDoanhThu [luongKhach=" + luongKhach + ", luongKhachTB="
        + luongKhachTB + ", doanhThuTrenMotKhach=" + doanhThuTrenMotKhach
        + ", doanhThuTong=" + doanhThuTong + "]";
  }

}
