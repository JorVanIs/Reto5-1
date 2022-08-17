
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
// Atributos de clase para gestión de conexión con la base de datos

    private static final String UBICACION_BD = "D:/JorVan/Estudio/MinTic-2022/Ciclo_2/Fundamentos_de_Programación/Reto5/ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
