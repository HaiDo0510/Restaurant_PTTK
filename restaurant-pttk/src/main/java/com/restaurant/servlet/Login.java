package com.restaurant.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.restaurant.dao.AdminDAO;
import com.restaurant.dao.impl.AdminDAOImpl;

@WebServlet("/Login")
public class Login extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public Login() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    AdminDAO adminDAO = new AdminDAOImpl();
    if (adminDAO.checkAccount(username, password)) {
      response.sendRedirect("/restaurant-pttk/views/gdChinhQL.jsp");
    } else {
      response.sendRedirect("/restaurant-pttk/views/login.jsp");
    }
  }

}
