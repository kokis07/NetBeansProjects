/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuichoMB
 */
public class modelo {
    Conexion cc= new Conexion();
    Connection cn=cc.GetConnection();
    
    String cons="";
    DefaultTableModel model;
    Statement estado;
    
    public DefaultTableModel cargar_tabla_categoria(String valor) throws SQLException{
        String [] titulos ={"Id","descripcion"};
        String [] registros= new String [2];
            
        model= new DefaultTableModel(null, titulos);
        
        cons="select categoria_Id, Descripcion from cat_categoria WHERE Descripcion LIKE '%"+valor+"%'";
        
        Statement st= cn.createStatement();
        ResultSet rs = st.executeQuery(cons);
        
        while(rs.next()){
            registros[0]= rs.getString(1);
            registros[1]= rs.getString(2);
            model.addRow(registros);
        }
        return model;
    }
    
    public void inserta_categoria(Integer vId, String vDescripcion){
        
        cons="INSERT into cat_categoria(Descripcion) VALUES (?)";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.setString(1, vDescripcion);
            int  n = pst.executeUpdate();
            if (n > 0){
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modifica_categoria(Integer vId, String vDescripcion){
        
        cons= "UPDATE cat_categoria SET Descripcion= '"+vDescripcion+"' WHERE categoria_Id="+vId+"";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminar_categoria(Integer vId){
        
        cons = "DELETE FROM cat_categoria WHERE categoria_Id = ' "+vId+" ' ";
        
        try{
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    /**********************************************************************************\
    |                  Cat_Carreras                                                                  |
    \*********************************************************************************/
    
        public DefaultTableModel cargar_tabla_carreras(String valor) throws SQLException{
        String [] titulos ={"Id","descripcion"};
        String [] registros= new String [2];
            
        model= new DefaultTableModel(null, titulos);
        
        cons="select carrera_id, descripcion from cat_carreras WHERE descripcion LIKE '%"+valor+"%'";
        
        Statement st= cn.createStatement();
        ResultSet rs = st.executeQuery(cons);
        
        while(rs.next()){
            registros[0]= rs.getString(1);
            registros[1]= rs.getString(2);
            model.addRow(registros);
        }
        return model;
    }
    
    public void inserta_carrera(Integer vId, String vDescripcion){
        
        cons="INSERT into cat_carreras(descripcion) VALUES (?)";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.setString(1, vDescripcion);
            int  n = pst.executeUpdate();
            if (n > 0){
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modifica_carreras(Integer vId, String vDescripcion){
        
        cons= "UPDATE cat_carreras SET descripcion= '"+vDescripcion+"' WHERE carreras_id="+vId+"";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminar_carreras(Integer vId){
        
        cons = "DELETE FROM cat_carreras WHERE carrera_id = '"+vId+"'";
        
        try{
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
     /**********************************************************************************\
    |                  Cat_Estado_Fisico                                                           |
    \***********************************************************************************/
    
        
        public DefaultTableModel cargar_tabla_estado_fisico(String valor) throws SQLException{
        String [] titulos ={"Id","descripcion"};
        String [] registros= new String [2];
            
        model= new DefaultTableModel(null, titulos);
        
        cons="select estadofisico_id, descripcion from cat_estadofisico WHERE descripcion LIKE '%"+valor+"%'";
        
        Statement st= cn.createStatement();
        ResultSet rs = st.executeQuery(cons);
        
        while(rs.next()){
            registros[0]= rs.getString(1);
            registros[1]= rs.getString(2);
            model.addRow(registros);
        }
        return model;
    }
    
    public void inserta_estado_fisico(Integer vId, String vDescripcion){
        
        cons="INSERT into cat_estadofisico(descripcion) VALUES (?)";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.setString(1, vDescripcion);
            int  n = pst.executeUpdate();
            if (n > 0){
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modifica_estado_fisico(Integer vId, String vDescripcion){
        
        cons= "UPDATE cat_estadofisico SET descripcion= '"+vDescripcion+"' WHERE estadofisico_id="+vId+"";
        
        try{
            PreparedStatement pst=cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminar_estado_fisico(Integer vId){
        
        cons = "DELETE FROM cat_estadofisico WHERE estadofisico_id = '"+vId+"'";
        
        try{
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Borrado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
