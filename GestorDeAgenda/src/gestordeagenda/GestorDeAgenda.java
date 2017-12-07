/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeagenda;

/**
 *
 * @author luis_
 */
public class GestorDeAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemAgenda ia1 = new ItemAgenda("Jorge Luis Fernando Martinez Hernandez", "2382079957", 75820);
         ItemAgenda ia2 = new ItemAgenda("Luis Fernando Martinez Osorio", "2381923456", 75720);
          ItemAgenda ia3 = new ItemAgenda("Juan  Martinez Osorio", "2381929610", 74720);
          
          //crear una agenda 
          Agenda a1 = new Agenda();
          a1.insertar(ia1);
          a1.insertar(ia2);
          a1.insertar(ia3);
          
          //ecribir el archivo
          a1.guardarAgenda("myAgenda.dat");
          
          //leer el archivo
          Agenda rA = Agenda.leerAgenda("myAgenda.dat");
          
          System.out.println(rA);
    }
    
}
