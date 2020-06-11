package JavaWeb.MyFirstProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class LoginServlet_old extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String read = new BufferedReader(new FileReader(new File("documents/HTML.html")))
                .lines().collect(Collectors.joining("\n"));
        try (PrintWriter w = resp.getWriter()) {
            w.write(read);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       try (OutputStream os=resp.getOutputStream()){
//           Files.copy(Paths.get("Documents","Pictures","windows.jpg"),os);
//       }
        LoginRegisterApp test = new LoginRegisterApp();


        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        String result = test.isRegistered(username, password);


        try (PrintWriter w = resp.getWriter()) {
            w.write(result);
        }
    }
}
