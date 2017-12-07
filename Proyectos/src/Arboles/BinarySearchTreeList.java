/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.Iterator;

/**
 *
 * @author luis_
 */
public class BinarySearchTreeList<T> extends LinkedBinarySearchTree<T> implements ListaADT<T>{

    public BinarySearchTreeList() {
        super();
    }
    
public BinarySearchTreeList(T element){
       super(element);
     }    

    
    public Iterator interator(){
        return iteratorInOrder();
    }

    
    public T removeFirst() {
        return removeMin();
        
    }

    
    public T removeLast() {
        return removeMax();
    }

    
    public T remove(T Element) {
        return removeElement(Element);
    }

    
    public T first() {
         return findMin();
    }

    @Override
    public T last() {
        return findMax();
    }
    
}
