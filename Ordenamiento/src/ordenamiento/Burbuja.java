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
public class Burbuja {
    
    public void ordenarBurbuja(int [] array){
        
        int aux;
        boolean cambios=false;
        
        while(true){
            cambios=false;
            for(int i=1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    cambios=true;
                }
            }
            if(cambios==false)
                break;
        }
    }
    
}
