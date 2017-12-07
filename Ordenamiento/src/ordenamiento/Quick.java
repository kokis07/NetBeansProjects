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
public class Quick {
    public void quick(int[] arreglo,int primero,int ultimo){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        do{
           while(arreglo[i]<pivote){
               i++;
           } 
           while(arreglo[j]>pivote){
               j--;
           }
         //Aqui hacemos el intercambio 
         if(i<=j){
             aux=arreglo[i];
             arreglo[i]=arreglo[j];
             arreglo[j]=aux;
             i++;
             j--;
         }
        }  while(i<=j);
        if(primero<j){
            quick(arreglo, primero, j);
        }
        if(i<ultimo){
            quick(arreglo, i, ultimo);
        }
        
    }
}
