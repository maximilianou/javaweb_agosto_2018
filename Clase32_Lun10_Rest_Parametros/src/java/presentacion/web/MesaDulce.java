package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MesaDulce", urlPatterns = {"/MesaDulce"})
public class MesaDulce extends HttpServlet {

    Gson CONVERTIR = new Gson();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO: Aqui programare lo que es Insertar algo Nuevo de Datos, 
        // HTTP POST === SQL INSERT
        ArrayList listado = new ArrayList();
        // Obtengo el Parametro del Usuario y lo Agrego a la REspuesta
        TreeMap<String, String> elObjetoParametroDelUsuarioClienteWeb
                = CONVERTIR.fromJson( request.getReader(), TreeMap.class );

        listado.add( elObjetoParametroDelUsuarioClienteWeb );
       
        listado.add("Uno");   // va a venir de la base de datos
        listado.add("Cinco"); // va a venir de la base de datos, despues..
        
        response.getWriter().print( CONVERTIR.toJson( listado ) ); 
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
