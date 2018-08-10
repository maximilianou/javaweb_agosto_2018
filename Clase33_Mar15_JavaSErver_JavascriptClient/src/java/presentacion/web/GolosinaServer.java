package presentacion.web;

import com.google.gson.Gson;
import entidades.Golosina;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GolosinaServer", urlPatterns = {"/GolosinaServer"})
public class GolosinaServer extends HttpServlet {

    Gson CONVERTIR = new Gson();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // HTTP GET === SQL SELECT
        //request.getParameter(name);
        System.out.println("!!! GoloServer GET consultar ");
        response.getWriter().print("\"GoloServer GET consultar\"");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // HTTP POST === SQL INSERT
// {} === Objeto, TreeMap, Golosina, Dictionary, HashMap, HashTable
// [] === ArrayList, LinkedList, Vector
// "" === String
// 32 === int, Integer, long, float  45.3

        Golosina parametroEnElServer = CONVERTIR.fromJson( request.getReader(), Golosina.class);
        System.out.println("!!! GoloServer POST insertar ");
        //response.getWriter().print("\"GoloServer POST insertar \"");
        parametroEnElServer.setDescripcion( parametroEnElServer.getDescripcion() + new java.util.Date() );
        response.getWriter().print( CONVERTIR.toJson( parametroEnElServer )  );
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HTTP PUT === SQL UPDATE
        System.out.println("!!! GoloServer PUT Actualizar ");
        resp.getWriter().print("\"GoloServer PUT Actualizar \"");

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HTTP DELETE === SQL DELETE
        System.out.println("!!! GoloServer DELETE === Borrar ");
        resp.getWriter().print("\"GoloServer DELETE === Borrar \"");

    }
}
