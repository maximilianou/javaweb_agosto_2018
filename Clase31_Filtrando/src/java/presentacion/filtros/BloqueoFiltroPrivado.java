package presentacion.filtros;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "BloqueoFiltroPrivado", urlPatterns = {"/privado/*"})
public class BloqueoFiltroPrivado implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FILTRO PRIVADO init()");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FILTRO PRIVADO doFilter() ! ! ! ! " + ( new java.util.Date() ));
        chain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        System.out.println("FILTRO PRIVADO destroy()");
    }


    
}
