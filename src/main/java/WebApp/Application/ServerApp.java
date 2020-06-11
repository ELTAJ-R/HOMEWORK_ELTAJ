package WebApp.Application;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9100);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new LoginServlet()), "/login/*");
        handler.addServlet(new ServletHolder(new CalcServlet()), "/calc/*");
        handler.addServlet(new ServletHolder(new CookiesServlet()), "/cookies/*");
        handler.addServlet(new ServletHolder(new LogoutServlet()), "/logout/*");
        handler.addServlet(new ServletHolder(new HistoryServlet()), "/history/*");
//        handler.addServlet(new ServletHolder(new RegistrationServlet()),"/register/*");
//        handler.addServlet(UploadServlet.class,"/upload/*").getRegistration()
//                .setMultipartConfig(new MultipartConfigElement("Documents/Pictures"));
        server.setHandler(handler);
        server.start();
        server.join();

    }


}
