package presentacion.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ConFiltro", urlPatterns = {"/privado/ConFiltro"})
public class ConFiltro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println(" - - - Con Filtro PRIVADO !!!" + request.getSession().getId() );
        response.getWriter().print("Con Filtro PRIVADO !!!" + request.getSession().getId());
    }

}
