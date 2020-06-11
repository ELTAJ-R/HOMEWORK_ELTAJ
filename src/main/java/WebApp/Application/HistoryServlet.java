package WebApp.Application;

import WebApp.Database.SQLdb;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class HistoryServlet extends HttpServlet {
    SQLdb test = new SQLdb();

    public HistoryServlet() throws SQLException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] cookies = req.getCookies();
            String user = cookies[0].getValue();
            String history = test.getHistory(user);
            try (PrintWriter w=resp.getWriter()){
                w.write(history);
            }
        } catch (NullPointerException e) {
            resp.sendRedirect("/login/*");
        } catch (Exception e) {
        }

    }
}
