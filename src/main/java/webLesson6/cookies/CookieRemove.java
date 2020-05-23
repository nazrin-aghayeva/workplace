package webLesson6.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieRemove extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    for(Cookie c:req.getCookies()) {
      c.setMaxAge(0);
      resp.addCookie(c);
    }

    try (PrintWriter w = resp.getWriter()) {
      w.write("Cookie removed");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
