package WebApp.Application;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] cookies = req.getCookies();
            Arrays.stream(cookies).forEach(c -> {
                c.setMaxAge(0);
                resp.addCookie(c);
            });
            resp.sendRedirect("/login/*");
        } catch (NullPointerException e) {
            resp.sendRedirect("/login/*");
        }
    }
}