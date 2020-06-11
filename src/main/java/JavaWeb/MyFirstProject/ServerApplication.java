package JavaWeb.MyFirstProject;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApplication {
    public static void main(String[] args) throws Exception {
        Server server = new Server(7000);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new RegisterServlet_old()), "/register/*");
        handler.addServlet(new ServletHolder(new LoginServlet_old()), "/login/*");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
