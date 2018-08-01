package presentacion.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "SinFiltro", urlPatterns = {"/SinFiltro"})
public class SinFiltro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(" - - - Sevlet Sin Filtro !!" + request.getSession().getId() );
        response.getWriter().print("Sevlet Sin Filtro !!" + request.getSession().getId() );
    }

}
