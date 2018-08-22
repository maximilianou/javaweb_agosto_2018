package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        TreeMap<String, String> param
                = CONVERTIR.fromJson( request.getReader(), TreeMap.class );
// DEfinimos Utilizar TreeMap Generico
        Connection conectar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/reposteria_db", 
                    "educacion", "educacion");
            PreparedStatement sentencia = 
                    conectar.prepareStatement(
                    "INSERT INTO articulos "
                    + "(art_titulo, art_descripcion, art_precio)VALUES"
                    + "(?,?,?)");
            sentencia.setString(1, param.get("titulo") );
            sentencia.setString(2, param.get("descripcion") );
            sentencia.setString(3, "100" );
            sentencia.execute();
response.getWriter().print( CONVERTIR.toJson( "OK!!" ) ); 
        }catch(Exception e){
            e.printStackTrace();
response.getWriter().print(CONVERTIR.toJson("Error:" + e.getMessage())); 
              
        }
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
        
        ArrayList listado = new ArrayList();
        // Obtengo el Parametro del Usuario y lo Agrego a la REspuesta
        TreeMap<String, String> param
                = CONVERTIR.fromJson( request.getReader(), TreeMap.class );
// DEfinimos Utilizar TreeMap Generico
        Connection conectar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/reposteria_db", 
                    "educacion", "educacion");
            PreparedStatement sentencia = 
                    conectar.prepareStatement(
                    " SELECT * FROM articulos  " );
            ResultSet resultadoSQL = sentencia.executeQuery();
            while( resultadoSQL.next() ){
                TreeMap<String, String> articuloActual = new TreeMap();
                articuloActual.put("id", resultadoSQL.getString("art_id"));
                articuloActual.put("titulo", resultadoSQL.getString("art_titulo"));
                articuloActual.put("descripcion", resultadoSQL.getString("art_descripcion"));
                articuloActual.put("precio", resultadoSQL.getString("art_precio"));
                listado.add( articuloActual );
            }
response.getWriter().print( CONVERTIR.toJson( listado ) ); 
        }catch(Exception e){
            e.printStackTrace();
response.getWriter().print(CONVERTIR.toJson("Error:" + e.getMessage())); 
              
        }


    }

}
