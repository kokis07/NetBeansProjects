/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controlador;
import Modelo.Conexion;
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author GuichoMB
 */
public class CatCarreras_MVC extends javax.swing.JInternalFrame {

    //Conexion cc= new Conexion();
    //Connection cn=cc.GetConnection();
    controlador c = new controlador();

    String accion;
    String vDescripcion = "";
    Integer vId = 0;
    DefaultTableModel model;

    public CatCarreras_MVC() throws SQLException {
        initComponents();
        bloquear();
        cargar_tabla("");
    }

    void bloquear() {
        txtid.setEnabled(false);
        txtdescripcion.setEnabled(false);

        mingresar.setEnabled(true);
        mModificar.setEnabled(true);
        mBorrar.setEnabled(true);
        mPreliminar.setEnabled(true);

        mGuardar.setEnabled(false);
        mCancel.setEnabled(false);

        txtBuscar.setEnabled(true);
        btnBuscar.setEnabled(true);
    }

    void desbloquear() {
        txtid.setEnabled(false);
        txtdescripcion.setEnabled(true);

        mingresar.setEnabled(false);
        mModificar.setEnabled(false);
        mBorrar.setEnabled(false);
        mPreliminar.setEnabled(false);

        mGuardar.setEnabled(true);
        mCancel.setEnabled(true);

        txtBuscar.setEnabled(false);
        btnBuscar.setEnabled(false);
    }

    void limpiar() {
        txtid.setText("");
        txtdescripcion.setText("");
    }

    void cargar(String valor) {

        //try{
        //String [] titulos ={"categoria_id","descripcion"};
        //String [] registros= new String [2];
        //model= new DefaultTableModel(null, titulos);
        //String cons= "select categoria_id,descripcion from cat_categoria WHERE descripcion LIKE '%"+valor+"%'";
        //Statement st= cn.createStatement();
        //ResultSet rs = st.executeQuery(cons);
        //while (rs.next()){
        //registros[0] = rs.getString(1);
        //registros[1] = rs.getString(2);
        //model.addRow(registros);
        //}
        //tbDatos.setModel(model);
        //tbDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        //tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        //}catch(SQLException e){
        //System.out.println(e.getMessage());
        //}
    }

    void cargar_tabla(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_carreras(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        mingresar = new javax.swing.JMenu();
        mModificar = new javax.swing.JMenu();
        mBorrar = new javax.swing.JMenu();
        mPreliminar = new javax.swing.JMenu();
        mGuardar = new javax.swing.JMenu();
        mCancel = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Carreras");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Id:");

        jLabel2.setText("Descripción:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Buscar:");

        btnBuscar.setText("Filtrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnBuscar)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbDatos);

        mingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ingresar.png"))); // NOI18N
        mingresar.setText("Ingresar ");
        mingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mingresarMouseClicked(evt);
            }
        });
        jMenuBar.add(mingresar);

        mModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/modify.png"))); // NOI18N
        mModificar.setText("Modificar");
        jMenuBar.add(mModificar);

        mBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        mBorrar.setText("Borrar");
        mBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mBorrarMouseClicked(evt);
            }
        });
        jMenuBar.add(mBorrar);

        mPreliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/preview.png"))); // NOI18N
        mPreliminar.setText("Reporte");
        jMenuBar.add(mPreliminar);

        mGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        mGuardar.setText("Guardar");
        mGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mGuardarMouseClicked(evt);
            }
        });
        jMenuBar.add(mGuardar);

        mCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        mCancel.setText("Cancelar");
        mCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mCancelMouseClicked(evt);
            }
        });
        jMenuBar.add(mCancel);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        jMenu8.setText("Salir");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenuBar.add(jMenu8);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mGuardarMouseClicked
        try {
            if (txtid.getText().isEmpty()) {
                vId = 0;
            } else {
                vId = Integer.parseInt(txtid.getText());
            }

            if (txtdescripcion.getText().isEmpty()) {
                vDescripcion = "";
            } else {
                vDescripcion = txtdescripcion.getText();
            }
            c.guardar_categoria(accion, vId, vDescripcion);
            tbDatos.setEnabled(true);
            bloquear();
            cargar_tabla("");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CatCarreras_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mGuardarMouseClicked

    private void mBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mBorrarMouseClicked

        int filasel = tbDatos.getSelectedRow();

        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione Registro");
            } else {
                vId=Integer.parseInt((String) tbDatos.getValueAt(filasel, 0));
                c.eliminar_carreras(vId);
                cargar_tabla("");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CatCarreras_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mBorrarMouseClicked

    private void mingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mingresarMouseClicked
        accion = "I";

        tbDatos.setEnabled(true);
        desbloquear();
        limpiar();
        txtdescripcion.requestFocus();
    }//GEN-LAST:event_mingresarMouseClicked

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void mCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mCancelMouseClicked
        bloquear();
        limpiar();
        try {
            cargar_tabla(" ");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CatCarreras_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu mBorrar;
    private javax.swing.JMenu mCancel;
    private javax.swing.JMenu mGuardar;
    private javax.swing.JMenu mModificar;
    private javax.swing.JMenu mPreliminar;
    private javax.swing.JMenu mingresar;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
