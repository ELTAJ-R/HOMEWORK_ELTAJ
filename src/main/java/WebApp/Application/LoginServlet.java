package WebApp.Application;

import WebApp.Database.SQLdb;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {
    SQLdb test = new SQLdb();


    public LoginServlet() throws SQLException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] cookies = req.getCookies();
            if (cookies.length != 0) resp.sendRedirect("/calc/*");
        } catch (NullPointerException e) {
            String result = new BufferedReader(new FileReader(new File("Documents/Login.html"))).lines()
                    .collect(Collectors.joining("\n"));
            try (PrintWriter w = resp.getWriter()) {
                w.write(result);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean isLoggedIn = false;
        String username = req.getParameter("Username");
        String parol = req.getParameter("MyPassword");
        try {
            isLoggedIn = test.checkIfExists(username, parol);
        } catch (SQLException e) {
        }
        if (isLoggedIn) {
            Cookie c = new Cookie("name", username);
            c.setPath("/");
            resp.addCookie(c);
            resp.sendRedirect("/calc/*");
        } else resp.sendRedirect("/login/*");
    }
}


//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
//        String username = req.getParameter("Username");
//        String parol = req.getParameter("MyPassword");
//        Configuration first= new Configuration(Configuration.VERSION_2_3_28) ;
//
//        first. setDirectoryForTemplateLoading(new File("Documents"));
//        first.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
//        first.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
//        first.setLogTemplateExceptions(false);
//        first.setWrapUncheckedExceptions(true);
//        try (PrintWriter w = resp.getWriter()) {
//
//            SQLdb test=new SQLdb();
//            HashMap<String,String>object=new HashMap<>();
//            boolean res = test.checkIfExists(username, parol);
//            if(res) {
//                HttpSession session=req.getSession();
//                session.setAttribute("username",username);
//                object.put("name",username);object.put("message","successful");
//                resp.sendRedirect("/upload/*");
//
//            }
//            else {object.put("name",username);object.put("message","Please register");}
////            System.out.println(res);
////
////            first.getTemplate("Configure.ftl").process(object, w);
//        } catch ( IOException | SQLException e) {
//            throw new RuntimeException("Freemarker error", e);
//        }
//    }




