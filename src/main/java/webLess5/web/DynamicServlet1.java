package webLess5.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class DynamicServlet1 extends HttpServlet {

  private final TemplateEngine engine;

  public DynamicServlet1(TemplateEngine engine) {
    this.engine = engine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    String name_for_jim = "Jim";
    HashMap<String, Object> data = new HashMap<>();
    data.put("name", name_for_jim);

    engine.render("dynamic1.ftl", data, resp);
  }
}
