package persistencia;

import java.util.*;
import entidad.*;

public class EntidadRegistral {

    public final static TreeMap<String, Registro> INSTANCIA = new TreeMap();

    public static void registrar(Registro reg) {
        INSTANCIA.put(reg.getNombre(), reg);
    }

    public static void bajar(Registro reg) {
        INSTANCIA.remove(INSTANCIA.get(reg.getNombre()));
    }

    public static boolean esta(Registro reg) {
        boolean siEsta = false;
        Registro actual = INSTANCIA.get(reg.getNombre());
        return actual != null && reg.getClave().equals(actual.getClave());
    }
}
