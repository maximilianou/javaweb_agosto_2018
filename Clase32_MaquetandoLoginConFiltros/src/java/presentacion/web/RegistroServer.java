package presentacion.web;

import com.google.gson.Gson;
import entidad.Registro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.EntidadRegistral;

@WebServlet(name = "RegistroServer", urlPatterns = {"/RegistroServer"})
public class RegistroServer extends HttpServlet {

    Gson CONVERTIR = new Gson();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// ArrayList === []
// TreeMap   === {}
// String    === ""
// int Integer float === 2  4.4  
// Registro  === {"nombre": "Miranda", "clave":"123"}
//        TreeMap<String, String> objetoParametro = CONVERTIR.fromJson(  req.getReader(), TreeMap.class );

        Registro objetoParametro = CONVERTIR.fromJson(  req.getReader(), Registro.class );
        
        EntidadRegistral.registrar( objetoParametro );
        
        resp.getWriter().print( CONVERTIR.toJson( EntidadRegistral.INSTANCIA )  );
    }

    
}
