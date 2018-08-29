package persistencia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitario.CarroOrder;

public class OrdenDao {

    public static void confirmar(CarroOrder orden) throws Exception {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/ameizon_db",
                    "educacion", "educacion");
            con.setAutoCommit(false);
            PreparedStatement sentencia = con.prepareStatement(
                    "INSERT INTO compras ()values() ");
            sentencia.execute();
            sentencia = con.prepareStatement(
                    "INSERT INTO compras_items ()values() ");
            sentencia.execute();
            con.commit();
        } catch (Exception e) {
            con.rollback();
        } finally {
            con.close();
        }
    }

}
