/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;

/**
 *
 * @author luis_
 */
public class Conexion {
    public Conexion(){
        
    }
    public Connection geConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver"). newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        }catch (Exception e){
        }
        return con;
    }

    Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
