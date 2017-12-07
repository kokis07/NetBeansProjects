package basededatos;



import java.sql.*;
import javax.swing.JOptionPane;

public class basededatos {

    public static Connection GetConnection() 
    {

        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/prestamos";
            String usuarioDB = "root";
            String passwordDB = "";
            conexion=DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexion de DB " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexio con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
            return conexion;
        }

    }
}