package webLess5.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DynamicServlet2 extends HttpServlet {

  private final TemplateEngine engine;

  public DynamicServlet2(TemplateEngine engine) {
    this.engine = engine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    List<Student> students = Arrays.asList(
        new Student("Jim", 20, "BE4"),
        new Student("Jack", 21, "BE3"),
        new Student("Jeremy", 25, "BE1")
    );

    HashMap<String, Object> data = new HashMap<>();
    data.put("students", students);

    engine.render("dynamic2.ftl", data, resp);
  }
}
