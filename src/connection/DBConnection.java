package connection;

/**
 * Clase que gestiona la conexión con la base de datos utilizando JDBC.
 * Esta clase se encarga de establecer y proporcionar una conexión activa con la base de datos.
 * 
 * Utiliza el patrón Singleton para asegurar una única instancia de conexión.
 * 
 * @author Administrador
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection conexion; // Objeto que representa la conexión con la base de datos

    /**
     * Constructor por defecto de la clase DBConnection.
     * Este constructor inicializa y establece la conexión con la base de datos.
     * 
     * Se encarga de cargar el driver JDBC, preparar la URL de conexión y conectar con la base de datos.
     * 
     * En caso de errores durante el proceso de conexión, imprime un mensaje de error y el rastreo de la pila.
     */
    public DBConnection() {
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Preparar la URL de conexión
            String url = "jdbc:mysql://localhost/bdTrabajadores1";

            // Conectar con la base de datos usando la URL, el usuario y la contraseña
            conexion = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la carga del Driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error conectando a la BBDD");
            e.printStackTrace();
        }
    }

    /**
     * Método que devuelve la conexión activa con la base de datos.
     * 
     * @return Objeto Connection que representa la conexión con la base de datos.
     */
    public Connection getConexion() {
        return conexion;
    }

}
