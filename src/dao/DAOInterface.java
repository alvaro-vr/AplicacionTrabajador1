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
public interface DAOInterface {
    public Trabajador get(String id);
    public ArrayList<Trabajador> getAll();
    public void insert(Object objeto);
    public void update(Object objeto);
    public void delete(Object object);
}
