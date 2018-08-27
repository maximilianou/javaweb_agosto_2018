package utilitario;

import java.util.ArrayList;
import java.util.TreeMap;

public class CarroComponente {

    ArrayList<TreeMap> listado = new ArrayList();

    public void agregar(TreeMap producto) {
        listado.add(producto);
    }

    public void quitar() {
    }

    public ArrayList<TreeMap> consultar() {
        return listado;
    }
}
