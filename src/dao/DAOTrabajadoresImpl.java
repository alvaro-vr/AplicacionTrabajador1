/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DBConnection;
import entidades.Trabajador;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class DAOTrabajadoresImpl implements DAOTrabajador {

    @Override
    public Trabajador get(String id) {
        Trabajador trabajador = null;
        Connection conn = new DBConnection().getConexion();

        String consulta = "SELECT * FROM trabajadores WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                trabajador = new Trabajador(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getDouble("sueldo"),
                        rs.getDate("fecha"),
                        rs.getString("matricula")
                );
            }

        } catch (SQLException ex) {
            System.out.println("Error al devolver el trabajador: ");
            Logger.getLogger(DAOTrabajadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return trabajador;
    }

    @Override
    public ArrayList<Trabajador> getAll() {
        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
        Connection conn = new DBConnection().getConexion();;

        String consulta = "SELECT * FROM trabajadores ";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                Trabajador t = new Trabajador(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getDouble("sueldo"),
                        rs.getDate("fecha"),
                        rs.getString("matricula")
                );
                trabajadores.add(t);
            }

        } catch (SQLException ex) {
            System.out.println("Error al devolver todos los trabajadores:");
            Logger.getLogger(DAOTrabajadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return trabajadores;
    }

    @Override
    public void insert(Trabajador trabajador) {
        Connection conn = new DBConnection().getConexion();
        
        String consulta = "INSERT INTO trabajadores VALUES (?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(1, trabajador.getDni());
            preparedStatement.setString(2, trabajador.getNombre());
            preparedStatement.setString(3, trabajador.getApellidos());
            preparedStatement.setDouble(4, trabajador.getSueldo());
            preparedStatement.setDate(5, (Date) trabajador.getFecha());
            preparedStatement.setString(6, trabajador.getMatricula());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al insertar el trabajador: ");
            Logger.getLogger(DAOTrabajadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Trabajador trabajador) {
        Connection conn = new DBConnection().getConexion();
        String consulta = "UPDATE trabajadores SET Nombre = ?, Apellidos = ?, Sueldo = ?, Fecha = ?, Matricula = ? WHERE DNI = ?";
        
         try {
            PreparedStatement preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(6, trabajador.getDni());
            preparedStatement.setString(1, trabajador.getNombre());
            preparedStatement.setString(2, trabajador.getApellidos());
            preparedStatement.setDouble(3, trabajador.getSueldo());
            preparedStatement.setDate(4 , (Date) trabajador.getFecha());
            preparedStatement.setString(5, trabajador.getMatricula());
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
             System.out.println("Error al modificar las propiedades a un trabajador");
            Logger.getLogger(DAOTrabajadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void delete(Trabajador trabajador) {

    }

}
