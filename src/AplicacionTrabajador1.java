
import vistas.VistaInicial;

/**
 * Clase principal que sirve como punto de entrada para la aplicación "AplicacionTrabajador1".
 * Esta clase inicializa y muestra la vista inicial de la aplicación.
 * 
 * La clase contiene un método principal que instancia y hace visible la vista inicial.
 * 
 * @author Administrador
 */
public class AplicacionTrabajador1 {
    
    /**
     * Método principal de la clase, que sirve como punto de entrada para la aplicación.
     * Crea una nueva instancia de la vista inicial y la hace visible.
     * 
     * @param args Los argumentos de línea de comandos, que no se utilizan en este contexto.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new VistaInicial().setVisible(true);
    }
    
}
