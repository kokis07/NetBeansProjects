/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.sql.SQLException;
import Model.PersonDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis_
 */
public class ControllerPerson {

    PersonDAO model = new PersonDAO();

    public void fillTable(JTable table) {
        DefaultTableModel modelTable = new DefaultTableModel();

        table.setModel(modelTable);

        modelTable.addColumn("DNI");
        modelTable.addColumn("LAST NAME");
        modelTable.addColumn("NAME");
        modelTable.addColumn("BIRTHDAY");
        modelTable.addColumn("PLACE");

        Object[] column = new Object[5];
        int numRows = model.listPerson().size();

        for (int i = 0; i < numRows; i++) {
            column[0] = model.listPerson().get(i).getDni();
            column[1] = model.listPerson().get(i).getLastName();
            column[2] = model.listPerson().get(i).getName();
            column[3] = model.listPerson().get(i).getBirthDay();
            column[4] = model.listPerson().get(i).getPlace();
            modelTable.addRow(column);
        }
    } // end fiilTable

    public void insertPerson(String lastName, String name, String BirthDay, String place) {

        String messageResult = model.insertPerson(name, lastName, name, BirthDay, place);
        if (messageResult != null) {
            JOptionPane.showMessageDialog(null, messageResult);
        } else {
            JOptionPane.showMessageDialog(null, "Registro erroneo");
        }
    }

    public void updatePerson(String dni, String lastName, String name, String date, String place) {
        String messageResult = model.updatPerson(dni, lastName, name, date, place);
        if (messageResult != null) {
            JOptionPane.showMessageDialog(null, messageResult);
        } else {
            JOptionPane.showMessageDialog(null, "Actualizacion Erronea!");//de lo contrario ejecuta este mensaje
        }
    }
     public void delatePerson(String dni){
         String messageResult = model.delatePerson(dni);
         
         
         if (messageResult != null){
              JOptionPane.showMessageDialog(null, messageResult);
    }else{
             JOptionPane.showMessageDialog(null, "Registro erroneo");
         }
         
     }
}
