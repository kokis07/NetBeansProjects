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
public interface ListaADT<T>{
     public void addElement(T element);
     
    public T removeFirst();
    public T removeLast();
    public T remove(T targetElement);
    public T first();
    public boolean contains(T targetElement);
    public int size();
    public T last();
    public boolean isEmpty();
}
