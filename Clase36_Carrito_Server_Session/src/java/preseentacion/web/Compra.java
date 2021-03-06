package preseentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utilitario.CarroItem;
import utilitario.CarroOrder;

@WebServlet(name = "Compra", urlPatterns = {"/Compra"})
public class Compra extends HttpServlet {
    
    private Gson CONVERTIR = new Gson();
    private CarroOrder carrito;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        carrito = (CarroOrder) request.getSession().getAttribute("carro");
        if( carrito == null ){
            carrito = new CarroOrder();
            request.getSession().setAttribute("carro", carrito);
        }
        response.getWriter().print(CONVERTIR.toJson(carrito.consultar().values()));
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarroItem productoComprado = CONVERTIR.fromJson(
                request.getReader(), CarroItem.class);
        carrito = (CarroOrder) request.getSession().getAttribute("carro");
        carrito.agregar( productoComprado );
        response.getWriter().print(CONVERTIR.toJson("OK"));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarroItem productoComprado = CONVERTIR.fromJson(
                req.getParameter("parametro"), CarroItem.class);
        carrito = (CarroOrder) req.getSession().getAttribute("carro");
        carrito.quitar( productoComprado );
        resp.getWriter().print(CONVERTIR.toJson("OK"));

    }
    
    
}
