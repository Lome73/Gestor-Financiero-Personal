package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/deudass?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );
            System.out.println("✅ Conectado a la BD");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Para ver el error completo
        }
        return conectar;
    }
}



