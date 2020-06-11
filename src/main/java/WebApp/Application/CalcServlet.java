package WebApp.Application;

import WebApp.Database.Calculator;
import WebApp.Database.SQLdb;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class CalcServlet extends HttpServlet {
    SQLdb test=new SQLdb();

    public CalcServlet() throws SQLException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] cookies = req.getCookies();
            if (cookies.length == 0) resp.sendRedirect("/login/*");
            String res = new BufferedReader(new FileReader(new File("Documents/Calc.html")))
                    .lines().collect(Collectors.joining("\n"));
            try (PrintWriter w = resp.getWriter()) {
                w.write(res);
            }

        } catch (NullPointerException e) {
            resp.sendRedirect("/login/*");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String operation = req.getParameter("operation");
        Calculator calculator = new Calculator();
        String res = calculator.doOperation(x, y, operation);
        Cookie[] cookies = req.getCookies();
        String currentUser = cookies[0].getValue();
        try {
            test.addHistory(currentUser,x,y,operation,res);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (PrintWriter w = resp.getWriter()) {
            w.write(res);
        }
    }
}




