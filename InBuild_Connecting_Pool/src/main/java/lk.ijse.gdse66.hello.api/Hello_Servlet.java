package lk.ijse.gdse66.hello.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/customer")
public class Hello_Servlet extends HttpServlet {

   @Override
   public void init() throws ServletException {
      try {
         InitialContext ic = new InitialContext();
         DataSource pool = (DataSource) ic.lookup("java:/comp/env/jdbc/pos");
         Connection connection = pool.getConnection();
         System.out.println(connection);
      } catch (NamingException | SQLException e) {
         throw new RuntimeException();
      }
   }

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   }

}
