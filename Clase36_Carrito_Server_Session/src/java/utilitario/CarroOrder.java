package utilitario;

import java.time.*;
import java.util.*;

public class CarroOrder {
    Cliente cliente;
    LocalDate fecha;
/* 
LocalDate now = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
String formattedDate = now.format(formatter);
LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
    
    getObject(int, LocalDate.class)
*/
    TreeMap<String, CarroItem> listado = new TreeMap();
    
    public void agregar(CarroItem producto) {
        CarroItem itemActual = listado.get(producto.getProducto().getId());
        if( itemActual == null ){
            listado.put( producto.getProducto().getId(), producto );
        }else{
            itemActual.setCantidad( itemActual.getCantidad() + producto.getCantidad());
        }
    }
    public void quitar(CarroItem producto) {
        listado.remove(producto.getProducto().getId());
    }
    public TreeMap<String, CarroItem> consultar() {
        return listado;
    }
}
