package presentacion.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Uso;

@WebServlet(name = "AmbitoPublico", urlPatterns = {"/AmbitoPublico"})
public class AmbitoPublico extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("... AmbitoPublico ...");
        resp.getWriter().print(Uso.CONVERTIR.toJson("Muy Bioen, A,bito Pubicso!! "));
    }
    
}
