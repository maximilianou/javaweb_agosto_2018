package presentacion.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MesaDulce", urlPatterns = {"/MesaDulce"})
public class MesaDulce extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Aqui programare lo que sea Consulta de Datos, 
        // HTTP GET === SQL SELECT
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Aqui programare lo que es Insertar algo Nuevo de Datos, 
        // HTTP POST === SQL INSERT
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Aqui programare lo que es Actualizar algo Que Existia de Datos, 
        // HTTP PUT === SQL UPDATE
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: Aqui programare lo que es Eliminar algo Que Existia de Datos, 
        // HTTP DELETE === SQL DELETE
    }

    

}
