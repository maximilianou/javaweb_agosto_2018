package presentacion.web;

import com.google.gson.Gson;
import entidades.Golosina;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.*;
import java.util.*;
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
        
        Connection conectar = null; // 1. Conectarme a la base de datos  
        try{ // intento Insertar en la Base
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/distribuidora_db",
                    "educacion","educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                  " SELECT * FROM golosinas ");
            ResultSet resultadoSQL = sentencia.executeQuery();
            ArrayList<TreeMap> listado = new ArrayList();
            
            while( resultadoSQL.next() ){
                TreeMap<String, String> golosinaActual = new TreeMap();
                golosinaActual.put("id", resultadoSQL.getString("gol_id"));
                golosinaActual.put("titulo", resultadoSQL.getString("gol_titulo"));
                golosinaActual.put("descripcion", resultadoSQL.getString("gol_descripcion"));
                golosinaActual.put("precio", resultadoSQL.getString("gol_precio"));
                listado.add( golosinaActual );
            }
            // Mensaje de OK
            response.getWriter().print( CONVERTIR.toJson( listado )  );
        }catch(Exception e){ // Si No puedo Insertar en la base Error
            e.printStackTrace();
            // Mensaje de Error
            response.getWriter().print(CONVERTIR.toJson("Error: " + e.getMessage()));
        }
 
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // HTTP POST === SQL INSERT
// {} === Objeto, TreeMap, Golosina, Dictionary, HashMap, HashTable
// [] === ArrayList, LinkedList, Vector
// "" === String
// 32 === int, Integer, long, float  45.3

        Golosina param = CONVERTIR.fromJson( request.getReader(), Golosina.class);
        System.out.println("!!! GoloServer POST insertar ");
        //response.getWriter().print("\"GoloServer POST insertar \"");
//        parametroEnElServer.setDescripcion( parametroEnElServer.getDescripcion() + new java.util.Date() );
        Connection conectar = null; // 1. Conectarme a la base de datos  
        try{ // intento Insertar en la Base
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/distribuidora_db",
                    "educacion","educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                    " INSERT INTO golosinas "
                  + " (gol_titulo, gol_descripcion, gol_precio) "
                  + " VALUES ( ?, ?, ? ) ");
            sentencia.setString(1, param.getTitulo() );
            sentencia.setString(2, param.getDescripcion() );
//            sentencia.setString(3, String.valueOf(  param.getPrecio() ) );
            sentencia.setDouble(3, param.getPrecio() );
            sentencia.execute();
            // Mensaje de OK
            response.getWriter().print( CONVERTIR.toJson( "OK" )  );
        }catch(Exception e){ // Si No puedo Insertar en la base Error
            e.printStackTrace();
            // Mensaje de Error
            response.getWriter().print(CONVERTIR.toJson("Error: " + e.getMessage()));
        }
//        response.getWriter().print( CONVERTIR.toJson( parametroEnElServer )  );
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HTTP PUT === SQL UPDATE
// UPDATE `golosinas` SET `gol_precio` = ?, gol_titulo = ?, gol_descripcion = ? WHERE `golosinas`.`gol_id` = ?;
        Golosina param = CONVERTIR.fromJson( req.getReader(), Golosina.class);
        System.out.println("!!! GoloServer POST insertar ");
        //response.getWriter().print("\"GoloServer POST insertar \"");
//        parametroEnElServer.setDescripcion( parametroEnElServer.getDescripcion() + new java.util.Date() );
        Connection conectar = null; // 1. Conectarme a la base de datos  
        try{ // intento Insertar en la Base
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/distribuidora_db",
                    "educacion","educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
" UPDATE golosinas SET gol_precio = ?, gol_titulo = ?, gol_descripcion = ? WHERE gol_id = ?;    " );
            sentencia.setDouble(1, param.getPrecio()  );
            sentencia.setString(2, param.getTitulo() );
            sentencia.setString(3, param.getDescripcion() );
//            sentencia.setString(3, String.valueOf(  param.getPrecio() ) );
            sentencia.setString(4, param.getId() ); // where ID
            sentencia.execute();
            // Mensaje de OK
            resp.getWriter().print( CONVERTIR.toJson( "OK" )  );
        }catch(Exception e){ // Si No puedo Insertar en la base Error
            e.printStackTrace();
            // Mensaje de Error
            resp.getWriter().print(CONVERTIR.toJson("Error: " + e.getMessage()));
        }
        
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HTTP DELETE === SQL DELETE
        
        
        Golosina param = CONVERTIR.fromJson(
                                 req.getParameter("parametro"), 
                              Golosina.class);
        Connection conectar = null; // 1. Conectarme a la base de datos  
        try{ 
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/distribuidora_db",
                    "educacion","educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                    " DELETE FROM golosinas "
                  + " WHERE  gol_id = ? ");
            sentencia.setString(1, param.getId());
            sentencia.execute();
            // Mensaje de OK
            resp.getWriter().print( CONVERTIR.toJson( "OK" )  );
        }catch(Exception e){ // Si No puedo Insertar en la base Error
            e.printStackTrace();
            // Mensaje de Error
            resp.getWriter().print(CONVERTIR.toJson("Error: " + e.getMessage()));
        }

        
    }
}
