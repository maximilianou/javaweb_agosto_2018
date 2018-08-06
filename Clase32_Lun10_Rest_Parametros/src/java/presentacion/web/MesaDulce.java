package presentacion.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MesaDulce", urlPatterns = {"/MesaDulce"})
public class MesaDulce extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Aqui programare lo que es Insertar algo Nuevo de Datos, 
        // HTTP POST === SQL INSERT
        
        response.getWriter().print(" [ 123456 , "); // int double float
        response.getWriter().print(" \"Texto\" ] "); // String
        
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Aqui programare lo que es Actualizar algo Que Existia de Datos, 
        // HTTP PUT === SQL UPDATE
        resp.getWriter().print("98765"); // int double float
        
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Aqui programare lo que es Eliminar algo Que Existia de Datos, 
        // HTTP DELETE === SQL DELETE
        resp.getWriter().print("333333"); // int double float
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Aqui programare lo que sea Consulta de Datos, 
        // HTTP GET === SQL SELECT
        response.getWriter().print("11442211"); // int double float
    }
    
    
}
