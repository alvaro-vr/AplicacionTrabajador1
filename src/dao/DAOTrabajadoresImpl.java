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
import java.time.LocalDate;
import java.time.Month;
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

        String consulta = "SELECT * FROM trabajadores WHERE dni = ?";
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
                        rs.getDate("fecha").toLocalDate(),
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
                        rs.getDate("fecha").toLocalDate(),
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
            java.sql.Date fecha = Date.valueOf(trabajador.getFecha());
            
            preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(1, trabajador.getDni());
            preparedStatement.setString(2, trabajador.getNombre());
            preparedStatement.setString(3, trabajador.getApellidos());
            preparedStatement.setDouble(4, trabajador.getSueldo());
            preparedStatement.setDate(5, fecha);
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
            java.sql.Date fecha = Date.valueOf(trabajador.getFecha());
            
            PreparedStatement preparedStatement = conn.prepareStatement(consulta);
            preparedStatement.setString(6, trabajador.getDni());
            preparedStatement.setString(1, trabajador.getNombre());
            preparedStatement.setString(2, trabajador.getApellidos());
            preparedStatement.setDouble(3, trabajador.getSueldo());
            preparedStatement.setDate(4, fecha);
            preparedStatement.setString(5, trabajador.getMatricula());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al modificar las propiedades a un trabajador");
            Logger.getLogger(DAOTrabajadoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Trabajador trabajador) {
        //pedir la conexión
        Connection conexion = new DBConnection().getConexion();

        try {
            String sql = "DELETE FROM trabajadores WHERE dni = ?";
            //Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            //rellenar las interrogaciones
            plataforma.setString(1, trabajador.getDni());
            plataforma.executeUpdate();

            //cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error borrando trabajador");
            e.printStackTrace();
        }

    }
}
