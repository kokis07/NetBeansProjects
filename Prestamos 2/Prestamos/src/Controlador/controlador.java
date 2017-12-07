/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Modelo.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuichoMB
 */
public class controlador {
    modelo m= new modelo();
    
    public DefaultTableModel cargar_tabla_categoria(String valor) throws SQLException{
        DefaultTableModel tb=m.cargar_tabla_categoria(valor);
        return tb;
    }
    
    public void guardar_categoria(String accion, Integer vId, String vDescripcion){
        if (accion== "I"){
            m.inserta_categoria(vId, vDescripcion);
        }
        if (accion=="M"){
            m.modifica_categoria(vId, vDescripcion);
        }
    }
    public void eliminar_categoria(Integer vId){
        m.eliminar_categoria(vId);
    }
        
    /**********************************************************************************\
    |                  Cat_Carreras                                                                  |
    \*********************************************************************************/
    
    public DefaultTableModel cargar_tabla_carreras(String valor) throws SQLException{
        DefaultTableModel tb=m.cargar_tabla_carreras(valor);
        return tb;
    }
    
    public void guardar_carreras(String accion, Integer vId, String vDescripcion){
        if (accion== "I"){
            m.inserta_carrera(vId, vDescripcion);
        }
        if (accion=="M"){
            m.modifica_carreras(vId, vDescripcion);
        }
    }
    public void eliminar_carreras(Integer vId){
        m.eliminar_carreras(vId);
    }
    
     /**********************************************************************************\
    |                  Cat_Estado_Fisico                                                           |
    \***********************************************************************************/
    
    public DefaultTableModel cargar_tabla_estadofisico(String valor) throws SQLException{
        DefaultTableModel tb=m.cargar_tabla_estado_fisico(valor);
        return tb;
    }
    
    public void guardar_estadofisico(String accion, Integer vId, String vDescripcion){
        if (accion== "I"){
            m.inserta_estado_fisico(vId, vDescripcion);
        }
        if (accion=="M"){
            m.modifica_estado_fisico(vId, vDescripcion);
        }
    }
    public void eliminar_estadofisico(Integer vId){
        m.eliminar_estado_fisico(vId);
    }
}


