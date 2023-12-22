package vistas;

import dao.DAOTrabajador;
import dao.DAOTrabajadoresImpl;
import entidades.Trabajador;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.table.DefaultTableModel;

public class dialogFiltrarTrabajador extends javax.swing.JDialog {
    
    public VistaInicial vistaInicial = null;
    public DAOTrabajador dao = new DAOTrabajadoresImpl();

    public dialogFiltrarTrabajador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtFiltrarDia = new javax.swing.JTextField();
        btnFiltrarCancelar = new javax.swing.JButton();
        txtFiltrarAnio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFiltrarDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFiltrarNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFiltrarApellidos = new javax.swing.JTextField();
        txtFiltrarSueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFiltrarMes = new javax.swing.JTextField();
        txtFiltrarMatricula = new javax.swing.JTextField();
        btnFiltrarAceptar = new javax.swing.JButton();
        comboSueldo = new javax.swing.JComboBox<>();
        comboFecha = new javax.swing.JComboBox<>();
        btnFiltrarVertodos = new javax.swing.JButton();
        panelOrdenacion = new javax.swing.JPanel();
        cboCamposOrdenacion = new javax.swing.JComboBox<>();
        radioASC = new javax.swing.JRadioButton();
        radioDESC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Trabajador");

        btnFiltrarCancelar.setText("Cancelar");
        btnFiltrarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCancelarActionPerformed(evt);
            }
        });

        txtFiltrarAnio.setPreferredSize(new java.awt.Dimension(100, 26));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Sueldo:");

        jLabel7.setText("Matricula:");

        btnFiltrarAceptar.setText("Aceptar");
        btnFiltrarAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarAceptarActionPerformed(evt);
            }
        });

        comboSueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", ">=", "<=", "<>" }));

        comboFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", ">=", "<=", "<>" }));

        btnFiltrarVertodos.setText("VerTodos");
        btnFiltrarVertodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVertodosActionPerformed(evt);
            }
        });

        panelOrdenacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        cboCamposOrdenacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Sin ordenación)", "DNI", "Nombre", "Apellidos", "Sueldo", "Fecha", "Matricula" }));

        buttonGroup1.add(radioASC);
        radioASC.setSelected(true);
        radioASC.setText("ASC");

        buttonGroup1.add(radioDESC);
        radioDESC.setText("DESC");

        javax.swing.GroupLayout panelOrdenacionLayout = new javax.swing.GroupLayout(panelOrdenacion);
        panelOrdenacion.setLayout(panelOrdenacionLayout);
        panelOrdenacionLayout.setHorizontalGroup(
            panelOrdenacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cboCamposOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelOrdenacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioASC)
                    .addComponent(radioDESC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOrdenacionLayout.setVerticalGroup(
            panelOrdenacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenacionLayout.createSequentialGroup()
                .addGroup(panelOrdenacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOrdenacionLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cboCamposOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOrdenacionLayout.createSequentialGroup()
                        .addComponent(radioASC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioDESC)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFiltrarMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltrarAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(comboSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltrarSueldo)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltrarMatricula))))
                    .addComponent(panelOrdenacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltrarApellidos)
                            .addComponent(txtFiltrarNombre)
                            .addComponent(txtFiltrarDni)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFiltrarAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrarVertodos)
                        .addGap(43, 43, 43)
                        .addComponent(btnFiltrarCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltrarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFiltrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFiltrarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(comboSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFiltrarSueldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFiltrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrarMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltrarAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFiltrarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrarCancelar)
                    .addComponent(btnFiltrarAceptar)
                    .addComponent(btnFiltrarVertodos))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarAceptarActionPerformed
        // TODO add your handling code here:
        
        List<Trabajador> lista = dao.getAll();
        
        //FILTRAR POR CAMPOS
        lista = filtrarPorCampos(lista);
        
        
        //ORDENAR LA LISTA
        lista = ordenarTrabajadores(lista, getSeleccion());
        
        
        //MOSTRAR LOS DATOS TRATADOS POR PANTALLA
        vistaInicial.prepararTabla();
        
        lista.stream().forEach(trabajador -> {
            ArrayList fila = new ArrayList();
            fila.add(trabajador.getDni());
            fila.add(trabajador.getNombre());
            fila.add(trabajador.getApellidos());
            fila.add(trabajador.getSueldo());
            fila.add(trabajador.getFecha());
            fila.add(trabajador.getMatricula());
            vistaInicial.modelo.addRow(fila.toArray());
        });
        
        vistaInicial.tableTrabajadores.setModel(vistaInicial.modelo);
        
        this.dispose();
    }//GEN-LAST:event_btnFiltrarAceptarActionPerformed

    private void btnFiltrarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFiltrarCancelarActionPerformed

    private void btnFiltrarVertodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVertodosActionPerformed
        // TODO add your handling code here:
        vistaInicial.actualizarTabla();
        this.dispose();
    }//GEN-LAST:event_btnFiltrarVertodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarAceptar;
    private javax.swing.JButton btnFiltrarCancelar;
    private javax.swing.JButton btnFiltrarVertodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCamposOrdenacion;
    private javax.swing.JComboBox<String> comboFecha;
    private javax.swing.JComboBox<String> comboSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelOrdenacion;
    private javax.swing.JRadioButton radioASC;
    private javax.swing.JRadioButton radioDESC;
    private javax.swing.JTextField txtFiltrarAnio;
    private javax.swing.JTextField txtFiltrarApellidos;
    private javax.swing.JTextField txtFiltrarDia;
    private javax.swing.JTextField txtFiltrarDni;
    private javax.swing.JTextField txtFiltrarMatricula;
    private javax.swing.JTextField txtFiltrarMes;
    private javax.swing.JTextField txtFiltrarNombre;
    private javax.swing.JTextField txtFiltrarSueldo;
    // End of variables declaration//GEN-END:variables

    //
    
    
    //METODOS DE ORDENACION de LA LISTA
    private boolean getSeleccion(){
        if(radioASC.isSelected()){
            return true;
        }else{
            return false;
        }
    }
    
    private List<Trabajador> ordenarTrabajadores(List<Trabajador> lista, boolean ascendente) {

        switch (cboCamposOrdenacion.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? o1.getDni().compareTo(o2.getDni()) : o2.getDni().compareTo(o1.getDni());
                    }
                });break;
            case 2:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? o1.getNombre().compareTo(o2.getNombre()) : o2.getNombre().compareTo(o1.getNombre());
                    }
                });break;
            case 3:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? o1.getApellidos().compareTo(o2.getApellidos()) : o2.getApellidos().compareTo(o1.getApellidos());
                    }
                });break;
            case 4:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? Double.valueOf(o1.getSueldo()-o2.getSueldo()).intValue() : Double.valueOf(o2.getSueldo()-o1.getSueldo()).intValue();
                    }
                });break;
            case 5:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? o1.getFecha().compareTo(o2.getFecha()) : o2.getFecha().compareTo(o1.getFecha());
                    }
                });break;
            case 6:
                Collections.sort(lista, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {
                        return ascendente ? o1.getMatricula().compareTo(o2.getMatricula()) : o2.getMatricula().compareTo(o1.getMatricula());
                    }
                });break;
            
        }
        
        return lista;
    }

    //Filtrar por campos
    private List<Trabajador> filtrarPorCampos(List<Trabajador> lista) {
        //DNI
        String dniFiltrado = txtFiltrarDni.getText();
        if(dniFiltrado.length() != 0){
            lista = lista.stream()
                    .filter(t -> t.getDni().equals(dniFiltrado))
                    .collect(Collectors.toList());
        }
        
        //Nombre
        String nombreFiltrado = txtFiltrarNombre.getText();
        if(nombreFiltrado.length() != 0){
            lista = lista.stream()
                    .filter(t -> t.getNombre().equalsIgnoreCase(nombreFiltrado))
                    .collect(Collectors.toList());
        }
        
        //Apellidos
        String apellidoFiltrado = txtFiltrarApellidos.getText();
        if(apellidoFiltrado.length() != 0){
            lista = lista.stream()
                    .filter(t -> t.getApellidos().equalsIgnoreCase(apellidoFiltrado))
                    .collect(Collectors.toList());
        }
        
        //Sueldo
        if(txtFiltrarSueldo.getText().length() != 0){
            double sueldoFiltrado = Double.valueOf(txtFiltrarSueldo.getText());
            lista = filtrarSueldo(lista, sueldoFiltrado);   
        }
        
        if(txtFiltrarAnio.getText().length() != 0 || txtFiltrarMes.getText().length() != 0 || txtFiltrarDia.getText().length() != 0){
            int anio = Integer.parseInt(txtFiltrarAnio.getText());
            int mes = Integer.parseInt(txtFiltrarMes.getText());
            int dia = Integer.parseInt(txtFiltrarDia.getText());
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            lista = filtrarFecha(lista, fecha);
        }
        
        
        //Matricula
        String matriculaFiltrada = txtFiltrarMatricula.getText();
        if(matriculaFiltrada.length() != 0){
            lista = lista.stream()
                    .filter(t -> t.getMatricula().equalsIgnoreCase(matriculaFiltrada))
                    .collect(Collectors.toList());
        }
        
        return lista;
    }
    
    private List<Trabajador> filtrarSueldo(List<Trabajador> lista, double sueldoFiltrado){
        Stream<Trabajador> list = lista.stream();
        
        switch(comboSueldo.getSelectedIndex()){
            case 0:
                list = list.filter(t -> t.getSueldo() == sueldoFiltrado);
                break;
            case 1:
                list = list.filter(t -> t.getSueldo() > sueldoFiltrado);
                break;
            case 2:
                list = list.filter(t -> t.getSueldo() < sueldoFiltrado);
                break;
            case 3:
                list = list.filter(t -> t.getSueldo() >= sueldoFiltrado);
                break;
            case 4:
                list = list.filter(t -> t.getSueldo() <= sueldoFiltrado);
                break;
            case 5:
                list = list.filter(t -> t.getSueldo() != sueldoFiltrado);
                break;
        }
        
        lista = list.collect(Collectors.toList());
        return lista;
    }
    
    private List<Trabajador> filtrarFecha(List<Trabajador> lista, LocalDate fecha){
        Stream<Trabajador> list = lista.stream();
        
        switch(comboFecha.getSelectedIndex()){
            case 0:
                list = list.filter(t -> t.getFecha().equals(fecha));
                break;
            case 1:
                list = list.filter(t -> t.getFecha().isAfter(fecha));
                break;
            case 2:
                list = list.filter(t -> t.getFecha().isBefore(fecha));
                break;
            case 3:
                list = list.filter(t ->  t.getFecha().isAfter(fecha) || t.getFecha().equals(fecha));
                break;
            case 4:
                list = list.filter(t ->  t.getFecha().isBefore(fecha) || t.getFecha().equals(fecha));
                break;
            case 5:
                list = list.filter(t -> !t.getFecha().equals(fecha));
                break;
        }
        
        lista = list.collect(Collectors.toList());
        return lista;
    }

}