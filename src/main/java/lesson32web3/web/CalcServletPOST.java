package lesson32web3.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServletPOST extends HttpServlet {

  private Calculator calc;

  public CalcServletPOST(Calculator calc) {
    this.calc = calc;
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String x = req.getParameter("x");
    String y = req.getParameter("y");
    String op = req.getParameter("op");
    try (PrintWriter writer = resp.getWriter()) {
      writer.write(calc.doOperation(x,y,op));
    }
  }
}
