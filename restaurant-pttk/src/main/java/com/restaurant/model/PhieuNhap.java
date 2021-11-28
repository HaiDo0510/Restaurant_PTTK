package com.restaurant.model;

import java.util.Date;

public class PhieuNhap {

  private Integer id;
  private Date ngay;
  private Integer tongchi;
  private Integer nhacungcap_id;
  private Integer nhanvien_id;

  public PhieuNhap() {
    super();
  }

  public PhieuNhap(Integer id, Date ngay, Integer tongchi,
      Integer nhacungcap_id, Integer nhanvien_id) {
    super();
    this.id = id;
    this.ngay = ngay;
    this.tongchi = tongchi;
    this.nhacungcap_id = nhacungcap_id;
    this.nhanvien_id = nhanvien_id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getNgay() {
    return ngay;
  }

  public void setNgay(Date ngay) {
    this.ngay = ngay;
  }

  public Integer getTongchi() {
    return tongchi;
  }

  public void setTongchi(Integer tongchi) {
    this.tongchi = tongchi;
  }

  public Integer getNhacungcap_id() {
    return nhacungcap_id;
  }

  public void setNhacungcap_id(Integer nhacungcap_id) {
    this.nhacungcap_id = nhacungcap_id;
  }

  public Integer getNhanvien_id() {
    return nhanvien_id;
  }

  public void setNhanvien_id(Integer nhanvien_id) {
    this.nhanvien_id = nhanvien_id;
  }

}
