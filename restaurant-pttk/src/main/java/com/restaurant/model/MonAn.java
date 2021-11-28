package com.restaurant.model;

public class MonAn {
  private Integer id;
  private String ten;
  private Integer gia;
  private String mota;

  public MonAn() {
    super();
    // TODO Auto-generated constructor stub
  }

  public MonAn(Integer id, String ten, Integer gia, String mota) {
    super();
    this.id = id;
    this.ten = ten;
    this.gia = gia;
    this.mota = mota;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public Integer getGia() {
    return gia;
  }

  public void setGia(Integer gia) {
    this.gia = gia;
  }

  public String getMota() {
    return mota;
  }

  public void setMota(String mota) {
    this.mota = mota;
  }

}
