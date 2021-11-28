package com.restaurant.servlet;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.restaurant.dao.impl.TKDoanhThuDAOImpl;
import com.restaurant.model.TKDoanhThu;

@WebServlet("/TKLuongKhachTBController")
public class TKLuongKhachTBController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public TKLuongKhachTBController() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    TKDoanhThuDAOImpl daoImpl = new TKDoanhThuDAOImpl();
    String ngayStart = request.getParameter("ngayStart");
    String ngayEnd = request.getParameter("ngayEnd");
    System.out.println(ngayStart);
    System.out.println(ngayEnd);
    Date ngayBatDau = null,ngayKetThuc = null;
    try {
      ngayBatDau = new SimpleDateFormat("yyyy-MM-dd").parse(ngayStart);
      ngayKetThuc = new SimpleDateFormat("yyyy-MM-dd").parse(ngayEnd);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    session.setAttribute("ngayStart", new SimpleDateFormat("dd/MM/yyyy").format(ngayBatDau));
    session.setAttribute("ngayEnd", new SimpleDateFormat("dd/MM/yyyy").format(ngayKetThuc));
    session.setAttribute("7h", daoImpl.getTKDoanhThuByGio(7, ngayBatDau, ngayKetThuc));
    session.setAttribute("8h", daoImpl.getTKDoanhThuByGio(8, ngayBatDau, ngayKetThuc));
    session.setAttribute("9h", daoImpl.getTKDoanhThuByGio(9, ngayBatDau, ngayKetThuc));
    session.setAttribute("10h", daoImpl.getTKDoanhThuByGio(10, ngayBatDau, ngayKetThuc));
    session.setAttribute("11h", daoImpl.getTKDoanhThuByGio(11, ngayBatDau, ngayKetThuc));
    session.setAttribute("12h", daoImpl.getTKDoanhThuByGio(12, ngayBatDau, ngayKetThuc));
    session.setAttribute("13h", daoImpl.getTKDoanhThuByGio(13, ngayBatDau, ngayKetThuc));
    session.setAttribute("14h", daoImpl.getTKDoanhThuByGio(14, ngayBatDau, ngayKetThuc));
    session.setAttribute("15h", daoImpl.getTKDoanhThuByGio(15, ngayBatDau, ngayKetThuc));
    session.setAttribute("16h", daoImpl.getTKDoanhThuByGio(16, ngayBatDau, ngayKetThuc));
    session.setAttribute("17h", daoImpl.getTKDoanhThuByGio(17, ngayBatDau, ngayKetThuc));
    session.setAttribute("18h", daoImpl.getTKDoanhThuByGio(18, ngayBatDau, ngayKetThuc));
    session.setAttribute("19h", daoImpl.getTKDoanhThuByGio(19, ngayBatDau, ngayKetThuc));
    session.setAttribute("20h", daoImpl.getTKDoanhThuByGio(20, ngayBatDau, ngayKetThuc));
    
    response.sendRedirect("/restaurant-pttk/views/gdTKLuongKhachTB.jsp");
//    DecimalFormat formatter = new DecimalFormat("###,###,###");
//    RequestDispatcher view = request.getRequestDispatcher("/views/gdTKLuongKhachTB.jsp");
//    view.forward(request, response);
  }

}
