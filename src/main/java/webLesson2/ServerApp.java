package webLesson2;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.Servlet;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server= new Server(9000);
        ServletContextHandler handler= new ServletContextHandler();

        handler.addServlet(new ServletHolder(new CalcServlet()),"/calc/*" );

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
