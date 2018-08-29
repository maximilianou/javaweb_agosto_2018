package preseentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utilitario.CarroOrder;

@WebServlet(name = "Confirmar", urlPatterns = {"/Confirmar"})
public class Confirmar extends HttpServlet {
    private Gson CONVERTIR = new Gson();
    private CarroOrder carrito;

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        carrito = (CarroOrder) req.getSession().getAttribute("carro");
        
    }


}
