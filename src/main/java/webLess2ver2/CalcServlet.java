package webLess2ver2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    // THE ONLY TASK IS TO EXTRACT THE PARAMS
    String x = req.getParameter("x");
    String y = req.getParameter("y");
    String op = req.getParameter("op");

    // THE ONLY TASK IS TO CALL THE BUSINESS LOGIC
    Calculator c = new Calculator();
    String res = c.doOperation(x, y, op);

    // THE ONLY TASK IS TO PRINT THE RESULT
    try (PrintWriter writer = resp.getWriter()) {
      writer.write(res);
    }
//    try (OutputStream os = resp.getOutputStream()) {
//      os.write();
//    }
  }
}
