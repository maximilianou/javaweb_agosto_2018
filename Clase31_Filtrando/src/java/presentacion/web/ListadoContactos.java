package presentacion.web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ListadoContactos", urlPatterns = {"/privado/ListadoContactos"})
public class ListadoContactos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if( null == request.getSession().getAttribute("Usuario") ){
          request.getSession().setAttribute("Usuario", "Marcelo : "+ ( new java.util.Date() ));
        }else{
        }
        System.out.println(" + + + Listado de Contactos Servlet " + request.getSession().getId() );
        response.getWriter().print(" Listado de Contactos Servlet " + request.getSession().getId()  + request.getSession().getAttribute("Usuario"));
    }
}
