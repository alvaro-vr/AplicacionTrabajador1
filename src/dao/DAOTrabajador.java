package dao;

import entidades.Trabajador;
import java.util.ArrayList;

/**
 * Interfaz DAOTrabajador que define los métodos para la gestión de operaciones CRUD relacionadas con los trabajadores.
 * 
 * Esta interfaz proporciona una abstracción para las operaciones de acceso a datos relacionadas con la entidad Trabajador.
 * 
 * @author Administrador
 */
public interface DAOTrabajador {

    /**
     * Recupera un trabajador basado en su identificador único.
     * 
     * @param id Identificador único del trabajador.
     * @return Objeto Trabajador si se encuentra, o null si no se encuentra.
     */
    public Trabajador get(String id);

    /**
     * Recupera todos los trabajadores almacenados en la base de datos.
     * 
     * @return Lista de objetos Trabajador.
     */
    public ArrayList<Trabajador> getAll();

    /**
     * Inserta un nuevo trabajador en la base de datos.
     * 
     * @param trabajador Objeto Trabajador que se va a insertar.
     */
    public void insert(Trabajador trabajador);

    /**
     * Actualiza la información de un trabajador existente en la base de datos.
     * 
     * @param trabajador Objeto Trabajador con la información actualizada.
     */
    public void update(Trabajador trabajador);

    /**
     * Elimina un trabajador de la base de datos basado en su identificador único.
     * 
     * @param dni Identificador único del trabajador (DNI).
     */
    public void delete(String dni);
}
