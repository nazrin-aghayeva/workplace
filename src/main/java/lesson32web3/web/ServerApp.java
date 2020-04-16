package lesson32web3.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);
    ServletContextHandler handler = new ServletContextHandler();

    // Service creation
    Calculator calc = new Calculator();
    // the only task is to MAP the SERVLET to the PATH
    handler.addServlet(new ServletHolder(new CalcServlet(calc)), "/calc/*");
    //                                                       ^^ - dependency injection
    handler.addServlet(new ServletHolder(new CalcServletGET(calc)), "/calc2/*");
    handler.addServlet(new ServletHolder(new CalcServletPOST(calc)), "/docalc/*");

//    handler.addServlet(new ServletHolder(new FileContentServlet()), "/file/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
