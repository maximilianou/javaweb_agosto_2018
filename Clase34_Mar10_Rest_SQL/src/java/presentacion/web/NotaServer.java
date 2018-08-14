package presentacion.web;

import com.google.gson.Gson;
import entidades.Nota;
import java.io.IOException;
import java.sql.*;
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
// INPUT de datos, en el servidor de aplicaciones
        Nota param = CONVERTIR.fromJson(request.getReader(), Nota.class); // asignarle lo que envio por web\

        System.out.println("!!! Servidor: Metodo Post, insertar");
// Procesamiento de datos, insertar en la base de datos con SQL

// 0. Cargar el Driver, en este caso, com.mysql.jdbc.Driver
// 1. Conectar con la base de datos
// 2. Preparar Sentencia
// 3. Ejecutar Sentencia
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/menu_db",
                    "educacion","educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                    "INSERT INTO comidas "
                  + " ( com_titulo, com_descripcion, com_precio ) "
                  + " VALUES "
                  + " ( ?, ?, ?) " );
            sentencia.setString(1, param.getTitulo());
            sentencia.setString(2, param.getDescripcion());
            sentencia.setString(3, String.valueOf( param.getPrecio() ));
            sentencia.execute();
        response.getWriter().print(
                CONVERTIR.toJson( "OK"));
        } catch (Exception e) {
            e.printStackTrace();
        response.getWriter().print(
                CONVERTIR.toJson( "Error: " + e.getMessage()));
        }
// OUTPUT de datos, del servidor avisando al cliente browser status       
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
