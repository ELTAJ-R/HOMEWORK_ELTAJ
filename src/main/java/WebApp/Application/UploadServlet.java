package WebApp.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String res = new BufferedReader(new FileReader(new File("Documents/Upload.html"))).lines()
                .collect(Collectors.joining("\n"));
        try (PrintWriter writer = resp.getWriter();) {
            writer.write(res);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        for (Part p : req.getParts()) {
            InputStream input = p.getInputStream();
            String fileName = p.getSubmittedFileName();
            Files.copy(input, Paths.get("Documents", String.format("__%s", fileName)));
        }
        try (PrintWriter w = resp.getWriter()) {
            w.write("Done!");
        }

    }
}