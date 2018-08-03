package presentacion.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "NotasServer", urlPatterns = {"/NotasServer"})
public class NotasServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// aqui seria para consultar HTTP GET === SQL SELECT
        System.out.println("!!! Servidor: Metodo Get, consultar");
       response.getWriter().print("Servidor: Metodo Get, consultar");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// aqui seria para consultar HTTP POST === SQL INSERT
       System.out.println("!!! Servidor: Metodo Post, insertar");
       response.getWriter().print("\"Servidor: Metodo Post, insertar\"");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// aqui seria para consultar HTTP PUT === SQL UPDATE
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// aqui seria para consultar HTTP DELETE === SQL DELETE
    }
    

}
