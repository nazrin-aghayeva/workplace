package webLess2ver2;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9000);
    ServletContextHandler handler = new ServletContextHandler();

    // the only task is to MAP the SERVLET to the PATH
    handler.addServlet(new ServletHolder(new CalcServlet()), "/calc/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
