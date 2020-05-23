package webLesson6.cookies;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletContextHandler handler = new ServletContextHandler();

    // set cookie to different paths
    handler.addServlet(new ServletHolder(new CookieSetLogin()), "/login/cs/*");
    handler.addServlet(new ServletHolder(new CookieSetAbc()), "/abc/cs/*");

    // read cookie from the different paths
    handler.addServlet(new ServletHolder(new CookieRead()), "/login/who/*");
    handler.addServlet(new ServletHolder(new CookieRead()), "/abc/who/*");

    // remove the cookie
    handler.addServlet(new ServletHolder(new CookieRemove()), "/cr/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
