/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class PersonDAO {

    Conexion conexion;

    public PersonDAO() {
        conexion = new Conexion();
    }

    public ArrayList<Person> listPerson() {
        ArrayList listPerson = new ArrayList();
        Person person;
        try {
            Connection DbAccess = conexion.getConexion();
            PreparedStatement ps = DbAccess.prepareStatement("SELECT * FROM person");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                person = new Person();
                person.setDni(rs.getString(1));
                person.setLastName(rs.getString(2));
                person.setName(rs.getString(3));
                person.setBirthDay(rs.getString(4));
                person.setPlace(rs.getString(5));
                listPerson.add(person);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return listPerson;
    } // end listPerson

    public String insertPerson(String dni, String lastName, String name, String BirthDay, String place) {
        String queryResult = null;
        try {
            Connection DbAccess = conexion.getConexion();
            PreparedStatement ps = DbAccess.prepareStatement("INSERT INTO person " + "(lastName,name,birthDay,place) VALUES(?,?,?,?)");
            ps.setString(1, lastName);
            ps.setString(2, name);
            ps.setString(3, BirthDay);
            ps.setString(4, place);

            int numAffectedRows = ps.executeUpdate();

            if (numAffectedRows > 0) {
                queryResult = "Registro Exitoso";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());

        }
        return queryResult;
    }

     public String updatPerson(String dni, String LastName, String name, String date, String place) {
        String queryResult = null;

        try {
            Connection DbAccess = conexion.getConexion();
            PreparedStatement ps = DbAccess.prepareStatement("UPDATE person set lastName" + " = '" + LastName + "', name= '" + name + "', birthDay='" + date + "',"+ " place = '" + place + "' WHERE dni =" + dni + "");

            int numAffectedRows = ps.executeUpdate();

            if (numAffectedRows > 0) {
                queryResult = "Actualizacion Exitosa!";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return queryResult;
    }
   
     public void delatePerson(String dni) throws SQLException{
         String queryResult = null;
         
         
           Connection DbAccess = conexion.getConexion();  
           PreparedStatement ps = DbAccess.prepareStatement("DELETE FROM person WHERE dni=" + dni+"");
           
     }

}
