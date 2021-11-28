package com.restaurant.model;

import java.util.Date;

public class HoaDon {
  private Integer id;
  private Date ngay;
  private Integer tongtien;
  private String mota;
  private Integer sokhach;
  private Integer giobatdau;
  private Integer gioketthuc;
  private Integer nhanvien_id;
  private Integer khachhang_id;

  public HoaDon() {
    super();
  }

  public HoaDon(Integer id, Date ngay, Integer tongtien, String mota,
      Integer sokhach, Integer giobatdau, Integer gioketthuc,
      Integer nhanvien_id, Integer khachhang_id) {
    super();
    this.id = id;
    this.ngay = ngay;
    this.tongtien = tongtien;
    this.mota = mota;
    this.sokhach = sokhach;
    this.giobatdau = giobatdau;
    this.gioketthuc = gioketthuc;
    this.nhanvien_id = nhanvien_id;
    this.khachhang_id = khachhang_id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getSokhach() {
    return sokhach;
  }

  public void setSokhach(Integer sokhach) {
    this.sokhach = sokhach;
  }

  public Date getNgay() {
    return ngay;
  }

  public void setNgay(Date ngay) {
    this.ngay = ngay;
  }

  public Integer getTongtien() {
    return tongtien;
  }

  public void setTongtien(Integer tongtien) {
    this.tongtien = tongtien;
  }

  public String getMota() {
    return mota;
  }

  public void setMota(String mota) {
    this.mota = mota;
  }

  public Integer getGiobatdau() {
    return giobatdau;
  }

  public void setGiobatdau(Integer giobatdau) {
    this.giobatdau = giobatdau;
  }

  public Integer getGioketthuc() {
    return gioketthuc;
  }

  public void setGioketthuc(Integer gioketthuc) {
    this.gioketthuc = gioketthuc;
  }

  public Integer getNhanvien_id() {
    return nhanvien_id;
  }

  public void setNhanvien_id(Integer nhanvien_id) {
    this.nhanvien_id = nhanvien_id;
  }

  public Integer getKhachhang_id() {
    return khachhang_id;
  }

  public void setKhachhang_id(Integer khachhang_id) {
    this.khachhang_id = khachhang_id;
  }

  @Override
  public String toString() {
    return "HoaDon [id=" + id + ", ngay=" + ngay + ", tongtien=" + tongtien
        + ", mota=" + mota + ", sokhach=" + sokhach + ", giobatdau=" + giobatdau
        + ", gioketthuc=" + gioketthuc + ", nhanvien_id=" + nhanvien_id
        + ", khachhang_id=" + khachhang_id + "]";
  }

}
