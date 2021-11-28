package com.restaurant.model;

public class Ban {
  private Integer id;
  private String ma;
  private Integer succhua;
  private String mota;

  public Ban() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Ban(Integer id, String ma, Integer succhua, String mota) {
    super();
    this.id = id;
    this.ma = ma;
    this.succhua = succhua;
    this.mota = mota;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMa() {
    return ma;
  }

  public void setMa(String ma) {
    this.ma = ma;
  }

  public Integer getSucchua() {
    return succhua;
  }

  public void setSucchua(Integer succhua) {
    this.succhua = succhua;
  }

  public String getMota() {
    return mota;
  }

  public void setMota(String mota) {
    this.mota = mota;
  }

}
