package entidades;

import java.time.LocalDate;

/**
 * Esta clase representa a un Trabajador con sus respectivos atributos y métodos
 * asociados. Contiene información como el DNI, nombre, apellidos, sueldo, fecha
 * de contratación y matrícula.
 *
 * @author Administrador
 */
public class Trabajador {

    // Atributos de la clase Trabajador
    private String dni;
    private String nombre;
    private String apellidos;
    private double sueldo;
    private LocalDate fecha;
    private String matricula;

    /**
     * Constructor para la clase Trabajador.
     *
     * @param dni DNI del trabajador.
     * @param nombre Nombre del trabajador.
     * @param apellidos Apellidos del trabajador.
     * @param sueldo Sueldo del trabajador.
     * @param fecha Fecha de contratación del trabajador.
     * @param matricula Matrícula asociada al trabajador.
     */
    public Trabajador(String dni, String nombre, String apellidos, double sueldo, LocalDate fecha, String matricula) {    
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.fecha = fecha;
        this.matricula = matricula;
    }

    /**
     * Método getter para obtener el DNI del trabajador.
     *
     * @return El DNI del trabajador.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método setter para establecer el DNI del trabajador.
     *
     * @param dni El nuevo DNI a establecer.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método getter para obtener el nombre del trabajador.
     *
     * @return El nombre del trabajador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del trabajador.
     *
     * @param nombre El nuevo nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener los apellidos del trabajador.
     *
     * @return Los apellidos del trabajador.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método setter para establecer los apellidos del trabajador.
     *
     * @param apellidos Los nuevos apellidos a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método getter para obtener el sueldo del trabajador.
     *
     * @return El sueldo del trabajador.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método setter para establecer el sueldo del trabajador.
     *
     * @param sueldo El nuevo sueldo a establecer.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método getter para obtener la fecha de incorporación del trabajador.
     *
     * @return La fehca de incorporación del trabajador.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Método setter para establecer la fecha de incorporación del trabajador.
     *
     * @param fecha La nueva fecha de incorporación a establecer.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Método getter para obtener la matrícula del trabajador.
     *
     * @return La matrícula del trabajador.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método setter para establecer la matrícula del trabajador.
     *
     * @param matricula La nueva matrícula a establecer.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    /**
     * Método para devolver todos los datos en una cadena de texto String
     * 
     * @return Datos del trabajador
     */
    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", fecha=" + fecha + ", matricula=" + matricula + '}';
    }

}
