package JavaWeb.MyFirstProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class RegisterServlet_old extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result = new BufferedReader(new FileReader(new File("Documents/Register.html"))).lines()
                .collect(Collectors.joining("\n"));
        try (PrintWriter w = resp.getWriter()) {
            w.write(result);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        String repeat = req.getParameter("Repeat");

        LoginRegisterApp test = new LoginRegisterApp();
        String result = test.register(username, password, repeat);
        String res = test.getAllUsers();
        try (PrintWriter w = resp.getWriter()) {
            w.write(res);
        }
    }
}
