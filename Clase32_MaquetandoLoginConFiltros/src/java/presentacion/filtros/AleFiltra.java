package presentacion.filtros;

import entidad.Registro;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import util.Uso;

@WebFilter(filterName = "AleFiltra", urlPatterns = {"/privado/*"})
public class AleFiltra implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(
            ServletRequest request, 
            ServletResponse response, 
            FilterChain chain) 
            throws IOException, ServletException {
        System.out.println("... AleFiltra ...............................");
        Registro actual = (Registro)((HttpServletRequest)request).getSession().getAttribute("Usuario");
        if ( null == actual ) { 
            System.out.println("...UPA AleFiltra ..............................." + actual);
            response.getWriter().print(Uso.CONVERTIR.toJson("Denegado !! ( Che! Vo! No PodE !! ) " + new java.util.Date() + " :: " + actual));
        } else {
            System.out.println("...OK AleFiltra ............................... " + actual);
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }

}
