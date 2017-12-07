/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;
import Model.*;
import View.*;
import Controler.*;

/**
 *
 * @author luis_
 */
public class CrudMvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jfPerson view = new jfPerson();
        PersonDAO model = new PersonDAO();
        ControllerPerson control = new ControllerPerson();
        
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
    }
    
}
