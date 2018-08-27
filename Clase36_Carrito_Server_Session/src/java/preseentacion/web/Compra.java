package preseentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utilitario.CarroComponente;

@WebServlet(name = "Compra", urlPatterns = {"/Compra"})
public class Compra extends HttpServlet {
    
    private Gson CONVERTIR = new Gson();
    private CarroComponente carrito;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        carrito = (CarroComponente) request.getSession().getAttribute("carro");
        if( carrito == null ){
            carrito = new CarroComponente();
            request.getSession().setAttribute("carro", carrito);
        }
        response.getWriter().print(CONVERTIR.toJson(carrito.consultar()));
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TreeMap productoComprado = CONVERTIR.fromJson(
                request.getReader(), TreeMap.class);
        carrito = (CarroComponente) request.getSession().getAttribute("carro");
        carrito.agregar( productoComprado );
        response.getWriter().print(CONVERTIR.toJson("OK"));
    }
}
