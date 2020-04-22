package webLess4.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server= new Server(7070);
        ServletContextHandler handler= new ServletContextHandler();
        LoginApp loginApp= new LoginApp();
        handler.addServlet(new ServletHolder(new StaticServlet("css")), "/css/*");
        handler.addServlet(new ServletHolder(new LoginServlet(loginApp)), "/login/*");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
