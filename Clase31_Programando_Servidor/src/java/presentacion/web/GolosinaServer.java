package presentacion.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GolosinaServer", urlPatterns = {"/GolosinaServer"})
public class GolosinaServer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // HTTP GET === SQL SELECT
       System.out.println("!!! GoloServer GET consultar ");
       response.getWriter().print("GoloServer GET consultar ");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // HTTP POST === SQL INSERT
        System.out.println("!!! GoloServer POST insertar ");
       response.getWriter().print("\"GoloServer POST insertar \"");
    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // HTTP PUT === SQL UPDATE
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // HTTP DELETE === SQL DELETE
    }
}
