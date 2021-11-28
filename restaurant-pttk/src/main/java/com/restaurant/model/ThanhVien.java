package com.restaurant.model;

import java.util.Date;

public class ThanhVien {

  private Integer id;
  private String username;
  private String password;
  private Date ngaySinh;
  private String email;
  private String sdt;
  private String ghiChu;
  private Integer hoten_id;

  public ThanhVien() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getGhiChu() {
    return ghiChu;
  }

  public void setGhiChu(String ghiChu) {
    this.ghiChu = ghiChu;
  }

  public Integer getHoten_id() {
    return hoten_id;
  }

  public void setHoten_id(Integer hoten_id) {
    this.hoten_id = hoten_id;
  }

}
