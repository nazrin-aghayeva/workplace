package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class InfoServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Hello"); // that will be printed in console

    try (PrintWriter w = resp.getWriter()) {
      Map<String, String[]> params = req.getParameterMap();
      w.write(String.format("req.getPathInfo:%s\n",req.getPathInfo()));
      w.write(String.format("req.getQueryString():%s\n",req.getQueryString()));
      w.write(String.format("req.getParameter(a):%s\n",req.getParameter("a")));
    }
  }
}
