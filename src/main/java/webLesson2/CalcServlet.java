package webLesson2;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class CalcServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String x= request.getParameter("x");
        String y= request.getParameter("y");
        String op= request.getParameter("op");
        Calculator calc= new Calculator();
        String res= calc.doOperation(x,y,op);

        try (PrintWriter writer = response.getWriter()) {
            writer.write(res);
        }
    }
}
