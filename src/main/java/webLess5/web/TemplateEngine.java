package webLess5.web;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class TemplateEngine {

  private final Configuration config;

  public TemplateEngine(String root_location) throws IOException {
    this.config = new Configuration(Configuration.VERSION_2_3_28) {{
        setDirectoryForTemplateLoading(new File("content"));
        setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        setLogTemplateExceptions(false);
        setWrapUncheckedExceptions(true);
      }};
  }

  public static TemplateEngine folder(String root_location) throws IOException {
    return new TemplateEngine(root_location);
  }

  public void render(String templateFile, HashMap<String, Object> data, HttpServletResponse resp) {
//    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("")));
    resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
    try (PrintWriter w = resp.getWriter()) {
      // we can write do any Writer
      config.getTemplate(templateFile).process(data, w);
    } catch (TemplateException | IOException x) {
      throw new RuntimeException("Freemarker error", x);
    }

  }
}
