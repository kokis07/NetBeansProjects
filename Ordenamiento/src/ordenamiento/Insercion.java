/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author luis_
 */
public class Insercion {
    
    public void ordenarInsercion(int[] arreglo){
        int aux;
        int cont1;
        int cont2;
        for(cont1=1; cont1<arreglo.length;cont1++){
            
            aux = arreglo[cont1];
            for(cont2=cont1-1; cont2 >=0 && arreglo[cont2]>aux;cont2--){
                arreglo[cont2+1]=arreglo[cont2];
                arreglo[cont2]=aux;
            }
        }
    }
    
}
