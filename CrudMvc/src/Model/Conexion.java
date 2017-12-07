/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author luis_
 */
public class Conexion {
    public Connection getConexion(){
       Connection conexion = null;
       
       try{
           
           Class.forName("com.mysql.jdbc.Driver"). newInstance();
           String serverDb = "jdbc:mysql://localhost:3306/mydb";
           String userDb = "root";
           String passwordDb = "";
           conexion = DriverManager.getConnection(serverDb, userDb, passwordDb);
       }catch (ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, "The Drinve was not Found");
          
       }catch (SQLException e){
           JOptionPane.showMessageDialog(null, "The was a problem");
       }finally{
           return conexion;
       }
    }


    
}
