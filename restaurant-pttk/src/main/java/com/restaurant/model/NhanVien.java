package com.restaurant.model;

public class NhanVien {

  private Integer id;
  private String vitri;
  private Integer nhanvien_id;

  public NhanVien() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getVitri() {
    return vitri;
  }

  public void setVitri(String vitri) {
    this.vitri = vitri;
  }

  public Integer getNhanvien_id() {
    return nhanvien_id;
  }

  public void setNhanvien_id(Integer nhanvien_id) {
    this.nhanvien_id = nhanvien_id;
  }

}
