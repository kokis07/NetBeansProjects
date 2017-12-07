/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author luis_
 */
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T>{
    public void addElement(T element);//añade un elemento al arbol
    
    public T removeElement(T targetElement);// remueve un elemento del arbol
    
    public void removeAllOCurrences(T targetElement);//elimina todas las apariciones de un elemento en el arbol
    
    public T removeMin();// elimina el elemento minimo del arbol
    public T removeMax();
    public T findMin();
    public T findMax();
}
