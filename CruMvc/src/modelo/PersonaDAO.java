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
public class PersonaDAO {
    Conexion conexion;
    
    public PersonaDAO(){
        conexion = new Conexion();
    }
    
    public String insertPersona(String dni, String lastName, String name, String BirthDay, String place){
      
        String queryResult = null;
        try{
            Connection DbAccess = conexion.getConexion();
            PreparedStatement ps = DbAccess.prepareStatement("INSERT INTO person (lastName,name,birthDay,place) VALUES(?,?,?,?)");
            ps.setString(1, lastName);
            ps.setString(2, name);
            ps.setString(3, BirthDay);
            ps.setString(4, place);
            
            int numAffectedRows = ps.executeUpdate();
            
            if (numAffectedRows > 0){
                queryResult = "Registro Exitoso";
            }
            
        }catch (Exception e){
            
        }
        return queryResult;
    }
    public ArrayList<Person> listPerson(){
        ArrayList listPerson = new ArrayList();
        Person person;
        try{
            Connection DbAccess = conexion.getConexion();
            PreparedStatement ps = DbAccess.prepareStatement("SELECT * FROM person");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                person = new Persona();
                person.setDni(rs.getString(1));
                person.setLastName(rs.getString(2));
                person.setName(rs.getString(3));
                person.setBirthDay(rs.getString(4));
                person.setPlace(rs.getString(5));
                listPerson.add(person);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return listPerson;
    } // end listPerson
}
    
