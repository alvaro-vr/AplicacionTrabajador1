/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 *
 * @author Administrador
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection conexion;
    //Contructor de la clase	

    public DBConnection() {
        try {
            //cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            //preparar la URL de conexión
            String url = "jdbc:mysql://localhost/bdTrabajadores";

            //conectar con la BBDD  --> ponemos la url, el usuario y la contraseña
            conexion = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la carga del Driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error conectando a la BBDD");
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

}
