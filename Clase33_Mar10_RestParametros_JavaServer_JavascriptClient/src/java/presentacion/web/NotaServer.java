package presentacion.web;

import com.google.gson.Gson;
import entidades.Nota;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "NotaServer", urlPatterns = {"/NotaServer"})
public class NotaServer extends HttpServlet {

    Gson CONVERTIR = new Gson();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// aqui seria para consultar HTTP GET === SQL SELECT
        System.out.println("!!! Servidor: Metodo Get, consultar");
       response.getWriter().print("\"Servidor: Metodo Get, consultar\"");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// aqui seria para consultar HTTP POST === SQL INSERT

// [] === ArrayList, LinkedList, Vector, 
// {} === TreeMap, Nota, HashMap, HashTable, Dictionary <k, v>
// "" === String
// 24 === int, long, float   23.4

       Nota parametroDelCliente = CONVERTIR.fromJson( request.getReader(), Nota.class ); // asignarle lo que envio por web\
       
       System.out.println("!!! Servidor: Metodo Post, insertar");
//       response.getWriter().print("\"Servidor: Metodo Post, insertar\"");
       parametroDelCliente.setDescripcion( 
               parametroDelCliente.getDescripcion() 
               + " Servidor: Metodo Post, insertar " 
               + new java.util.Date() );
       response.getWriter().print( CONVERTIR.toJson( parametroDelCliente ) );
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// aqui seria para consultar HTTP PUT === SQL UPDATE
       System.out.println("!!! Servidor: Metodo PUT, actualizar");
       resp.getWriter().print("\"Servidor: Metodo PUT, actualizar\"");

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// aqui seria para consultar HTTP DELETE === SQL DELETE
       System.out.println("!!! Servidor: Metodo DELETE, borrar");
       resp.getWriter().print("\"Servidor: Metodo DELETE, borrar\"");
    }
    

}
