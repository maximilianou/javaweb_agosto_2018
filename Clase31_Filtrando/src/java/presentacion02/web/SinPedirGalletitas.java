package presentacion02.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SinPedirGalletitas", urlPatterns = {"/SinPedirGalletitas"})
public class SinPedirGalletitas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(" ! ! ! Galletitas Faltantes, Sin Galletitias, Help Help !!");
        response.getWriter().print("Galletitas Faltantes, Sin Galletitias, Help Help !!");
    }

}
