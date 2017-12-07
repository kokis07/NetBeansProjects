/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author luis_
 */
public interface StackADT<T> {
    
    public void push(T element);
    
    public T pop();
    
    public T peek();
    
    public boolean isEmpty();
    
    public int size();
    
    public String toString();
}
