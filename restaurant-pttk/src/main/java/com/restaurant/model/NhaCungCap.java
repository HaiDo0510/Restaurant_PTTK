package com.restaurant.model;

public class NhaCungCap {
  private Integer id;
  private String ten;
  private String sdt;
  private String mota;
  private Integer diachi_id;

  public NhaCungCap() {
    super();
    // TODO Auto-generated constructor stub
  }

  public NhaCungCap(Integer id, String ten, String sdt, String mota,
      Integer diachi_id) {
    super();
    this.id = id;
    this.ten = ten;
    this.sdt = sdt;
    this.mota = mota;
    this.diachi_id = diachi_id;
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

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getMota() {
    return mota;
  }

  public void setMota(String mota) {
    this.mota = mota;
  }

  public Integer getDiachi_id() {
    return diachi_id;
  }

  public void setDiachi_id(Integer diachi_id) {
    this.diachi_id = diachi_id;
  }

}
