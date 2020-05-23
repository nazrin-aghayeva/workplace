package stepProject6;

import lesson34w05.web.TemplateEngine;

import java.io.IOException;
import java.net.URISyntaxException;

public class TemplateApp {
  public static void main(String[] args) throws IOException, URISyntaxException {
    // it's highly probable that will NOT work oh hosting environment
    TemplateEngine te0 = new TemplateEngine("./src/main/java/....");
    TemplateEngine te1 = TemplateEngine.folder("./src/main/java/....");
    TemplateEngine tw2 = TemplateEngine.resources("templates");
  }

}
