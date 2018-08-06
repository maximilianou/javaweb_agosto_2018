package presentacion02.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PonerEnSession", urlPatterns = {"/publico/PonerEnSession"})
public class PonerEnSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if( null == request.getSession().getAttribute("Usuario") ){
          request.getSession().setAttribute("Usuario", " Estefania : "+ ( new java.util.Date() ));
        }else{
        }
        System.out.println(" ++ ++ ++ Poner En Session Servlet " + request.getSession().getId() );
        response.getWriter().print(" Poner En Session Servlet " + request.getSession().getId()  + request.getSession().getAttribute("Usuario"));
    }
}
