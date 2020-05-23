package webLesson6.cookies;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CookieRead extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    String cookies = Arrays.stream(req.getCookies())
        .map(c -> String.format("name=%s, value=%s", c.getName(), c.getValue()))
        .collect(Collectors.joining(" "));

    try (PrintWriter w = resp.getWriter()) {
      w.write("Cookie read:");
      w.write(cookies);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
