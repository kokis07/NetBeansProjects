package proyectos;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class BusquedaOrdenamiento<T> {
    
    public boolean linearSearch(T[] data, int min, int max, T target){//
                                   
                                  
        int index=min;
        boolean found= false;
        while (!found && index<= max){
            if(data[index].equals(target)){
                found = true;
            }
            index++;
        }
         return found;
    }
    
}
