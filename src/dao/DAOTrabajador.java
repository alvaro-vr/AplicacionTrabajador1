/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public interface DAOTrabajador {
    public Trabajador get(String id);
    public ArrayList<Trabajador> getAll();
    public void insert(Trabajador trabajador);
    public void update(Trabajador trabajador);
    public void delete(Trabajador trabajador);
}
