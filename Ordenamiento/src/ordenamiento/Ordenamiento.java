/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //burbuja
        
//        int []arreglo = {5,3,4,2,6,8,9,10,7,1};
//        Burbuja b = new Burbuja();
//        b.ordenarBurbuja(arreglo);
//        
//        for(int i=0;i<arreglo.length;i++)
//            System.out.println(arreglo[i]);

             
         //insercion directa
            
//             int []arreglo = {4,6,20,1,3,50,7,9,80};
//             Insercion i = new Insercion();
//             i.ordenarInsercion(arreglo);
//             
//             for(int x=0; x<arreglo.length; x++){
//                 System.out.println(arreglo[x]);
//             }

             //quick
             
             Quick q = new Quick();
             int vector1[]={5,6,3,44,22,1};
             int vector2[]={55,4,43,44,2,10,4567,45638};
             int vector3[]={5,2,1,8,3,9,7};
             
             q.equals(q);
             q.quick(vector3, 0, vector3.length-1);
             for(int x=0; x<vector3.length; x++){
                 System.out.println(vector3[x]);
             }
    }
    
}
