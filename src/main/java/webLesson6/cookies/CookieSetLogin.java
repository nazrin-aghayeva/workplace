package webLesson6.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieSetLogin extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    try (PrintWriter w = resp.getWriter()) {
      w.write("Cookie set to /login path");
      Cookie c = new Cookie("id", "123");
      resp.addCookie(c);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
