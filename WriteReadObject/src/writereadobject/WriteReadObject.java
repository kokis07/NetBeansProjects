/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writereadobject;
import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class WriteReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //writes an object to a binary file
        
        ObjectOutputStream fileOut;
        TestObject obj = new TestObject (1,"test1", 2.0);
        String fileName = JOptionPane.showInputDialog(null, "Enter the file´s name");
        
        try {
             fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
             fileOut.writeObject(obj);
             fileOut.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFound" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOException" + ex.getMessage());
        } 
       // end write
      
       //Reads object from a binary file
       
       TestObject objIn;
       
            
         try {   
         ObjectInputStream fileInt = new ObjectInputStream(new FileInputStream(fileName));
         objIn = (TestObject)fileInt.readObject();
         objIn.display();
         
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNot found" + ex.getMessage());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "IOException" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ClassNotFound" + ex.getMessage());
        }
    }
    
}
