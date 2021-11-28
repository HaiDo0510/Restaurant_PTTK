package com.restaurant.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.restaurant.dao.HoaDonDAO;
import com.restaurant.dao.impl.HoaDonDAOImlp;
import com.restaurant.model.HoaDon;

@WebServlet("/TKKhungGioController")
public class TKKhungGioController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public TKKhungGioController() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    HttpSession session = request.getSession();
    String khungGio = request.getParameter("kg");
    Date ngayBatDau = null, ngayKetThuc = null;
    try {
      ngayBatDau = new SimpleDateFormat("dd/MM/yyyy")
          .parse(request.getParameter("ngayStart"));
      ngayKetThuc = new SimpleDateFormat("dd/MM/yyyy")
          .parse(request.getParameter("ngayEnd"));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    HoaDonDAO hoaDonDAO = new HoaDonDAOImlp();
    List<HoaDon> lHoaDons = hoaDonDAO
        .getAllByDateAndKG(Integer.parseInt(khungGio), ngayBatDau, ngayKetThuc);
    System.out.println("size:    "+lHoaDons.size());
    for(HoaDon h:lHoaDons) {
      System.out.println(h.toString());
    }
    session.setAttribute("kg", khungGio);
    session.setAttribute("listHD", lHoaDons);
    response.sendRedirect("/restaurant-pttk/views/gdTKKhungGio.jsp");
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    
    response.sendRedirect("/restaurant-pttk/views/gdTKKhungGio.jsp");
  }

}
