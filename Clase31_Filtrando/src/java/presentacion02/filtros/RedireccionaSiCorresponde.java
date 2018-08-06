package presentacion02.filtros;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "RedireccionaSiCorresponde", urlPatterns = {"/privado/*"})
public class RedireccionaSiCorresponde implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if( null != ((HttpServletRequest)request).getSession().getAttribute("Usuario") ){
            System.out.println(" 3 x L : Filtro Usuario Login OK OK OK "  );
            chain.doFilter(request, response); // te dejo pasar
        }else{
            System.out.println(" 3 x L : Filtro Usuario Login OLVIDATE !! Forwardeo"  );
            request.getRequestDispatcher("../logueate.html").forward(request, response); // forguardearlo
        }
    }

    @Override
    public void destroy() {

    }
    
}
