package presentacion.web;

import com.google.gson.Gson;
import entidad.Registro;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.EntidadRegistral;
import util.Uso;

@WebServlet(name = "EncuentroServer", urlPatterns = {"/EncuentroServer"})
public class EncuentroServer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Registro login = Uso.CONVERTIR.fromJson( req.getReader(), Registro.class);
        if( EntidadRegistral.esta(login) ){
            req.getSession().setAttribute("Usuario", login);
            System.out.println("... EncuentroServer logIN ..." + req.getSession().getAttribute("Usuario") );
            resp.getWriter().print( Uso.CONVERTIR.toJson("OK " + req.getSession().getAttribute("Usuario")) );
        }else{
            req.getSession().removeAttribute("Usuario");
            System.out.println("... EncuentroServer logOUT ..." + req.getSession().getAttribute("Usuario") );
            resp.getWriter().print( Uso.CONVERTIR.toJson("Olvidate, equivocaste usuario o clave!!!" + (new java.util.Date())) );
        }
    }

}
