/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import dao.DAOTrabajador;
import dao.*;
import entidades.Trabajador;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class VistaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial
     */
    
    private final DAOTrabajador dao = new DAOTrabajadoresImpl();
    private final String[] cabeceraTabla = {
        "DNI", "Nombre", "Apedillos", "Sueldo", "Fecha", "Matricula"
    };
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public VistaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        prepararTabla();
        rellenarTabla();
    }
    
    public void prepararTabla(){
        modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDOS");
        modelo.addColumn("SUELDO");
        modelo.addColumn("FECHA");
        modelo.addColumn("MATRICULA");
    }
    
    public void rellenarTabla(){
        ArrayList<Trabajador> trabajadores = dao.getAll();
        trabajadores.stream().forEach(trabajador -> {
            ArrayList fila = new ArrayList();
            fila.add(trabajador.getDni());
            fila.add(trabajador.getNombre());
            fila.add(trabajador.getApellidos());
            fila.add(trabajador.getSueldo());
            fila.add(trabajador.getFecha());
            fila.add(trabajador.getMatricula());
            modelo.addRow(fila.toArray());
        });
        
        tableTrabajadores.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogGeneral = new javax.swing.JDialog();
        scrollPanelTabla = new javax.swing.JScrollPane();
        tableTrabajadores = new javax.swing.JTable();
        panelContenedorBotones = new javax.swing.JPanel();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnAñadirTrabajador = new javax.swing.JButton();
        btnModificarTrabajador = new javax.swing.JToggleButton();

        javax.swing.GroupLayout dialogGeneralLayout = new javax.swing.GroupLayout(dialogGeneral.getContentPane());
        dialogGeneral.getContentPane().setLayout(dialogGeneralLayout);
        dialogGeneralLayout.setHorizontalGroup(
            dialogGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogGeneralLayout.setVerticalGroup(
            dialogGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla Trabajadores");

        tableTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        scrollPanelTabla.setViewportView(tableTrabajadores);

        panelContenedorBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btnEliminarTrabajador.setText("Eliminar Trabajador");
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        panelContenedorBotones.add(btnEliminarTrabajador);

        btnAñadirTrabajador.setText("Añadir Trabajador");
        btnAñadirTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirTrabajadorActionPerformed(evt);
            }
        });
        panelContenedorBotones.add(btnAñadirTrabajador);

        btnModificarTrabajador.setText("Modificar Trabajador");
        btnModificarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTrabajadorActionPerformed(evt);
            }
        });
        panelContenedorBotones.add(btnModificarTrabajador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrollPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnAñadirTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirTrabajadorActionPerformed

    private void btnModificarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarTrabajadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirTrabajador;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JToggleButton btnModificarTrabajador;
    private javax.swing.JDialog dialogGeneral;
    private javax.swing.JPanel panelContenedorBotones;
    private javax.swing.JScrollPane scrollPanelTabla;
    private javax.swing.JTable tableTrabajadores;
    // End of variables declaration//GEN-END:variables
}
