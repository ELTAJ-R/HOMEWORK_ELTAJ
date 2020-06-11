package WebApp.Application;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] cookies = req.getCookies();
            String myCookies = Arrays.stream(cookies).map(a -> String.format("%s  %s", a.getName(), a.getValue()))
                    .collect(Collectors.joining());
            try (PrintWriter w = resp.getWriter()) {
                w.write(myCookies);
            }
        } catch (NullPointerException e) {
            resp.sendRedirect("/login/*");
        }
    }
}