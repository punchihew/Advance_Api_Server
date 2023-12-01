package lk.ijse.gdse.hello.api;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello_Servelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request: Hello Servlet" +req.getRemoteAddr());
        resp.getWriter().println("HTTP get method");
        resp.getWriter().println("HTTP GET !!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request: Hello Servlet" +req.getRemoteAddr());
        resp.getWriter().println("HTTP POS !!");
        resp.getWriter().println("HTTP Pos   method");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request: Hello Servlet" +req.getRemoteAddr());
        resp.getWriter().println("HTTP Put   method");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request: Hello Servlet" +req.getRemoteAddr());
        resp.getWriter().println("HTTP Delete   method");
    }
}