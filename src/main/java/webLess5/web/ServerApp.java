package webLess5.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.MultipartConfigElement;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletContextHandler handler = new ServletContextHandler();

    TemplateEngine engine = TemplateEngine.folder("./content");
    handler.addServlet(new ServletHolder(new DynamicServlet1(engine)), "/hello/*");
    handler.addServlet(new ServletHolder(new DynamicServlet2(engine)), "/bye/*");

    handler.addServlet(UploadServlet.class, "/upload/*")
        .getRegistration().setMultipartConfig(new MultipartConfigElement("./from_user"));

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
