package com.restaurant.model;

public class KhachHang {
  private Integer id;
  private String sdt;
  private String email;
  private String ghichu;
  private Integer hoten_id;
  private Integer diachi_id;

  public KhachHang() {
    super();
    // TODO Auto-generated constructor stub
  }

  public KhachHang(Integer id, String sdt, String email, String ghichu,
      Integer hoten_id, Integer diachi_id) {
    super();
    this.id = id;
    this.sdt = sdt;
    this.email = email;
    this.ghichu = ghichu;
    this.hoten_id = hoten_id;
    this.diachi_id = diachi_id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGhichu() {
    return ghichu;
  }

  public void setGhichu(String ghichu) {
    this.ghichu = ghichu;
  }

  public Integer getHoten_id() {
    return hoten_id;
  }

  public void setHoten_id(Integer hoten_id) {
    this.hoten_id = hoten_id;
  }

  public Integer getDiachi_id() {
    return diachi_id;
  }

  public void setDiachi_id(Integer diachi_id) {
    this.diachi_id = diachi_id;
  }

}
