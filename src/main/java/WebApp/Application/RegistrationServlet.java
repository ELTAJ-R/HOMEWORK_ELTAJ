

import WebApp.Database.SQLdb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = new BufferedReader(new FileReader(new File("documents/createAccount.html"))).lines()
                .collect(Collectors.joining("\n"));
        try (PrintWriter w = resp.getWriter()) {
            w.write(html);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        String passwordRepeat = req.getParameter("PasswordRepeat");
        String email = req.getParameter("E-mail");

        try {
            SQLdb test = new SQLdb();
            String res = test.Register(username, password, passwordRepeat, email);
            try (PrintWriter w = resp.getWriter()) {
                w.write(res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

