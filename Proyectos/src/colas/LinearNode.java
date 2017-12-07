/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import colas.*;

/**
 *
 * @author luis_
 */
public class LinearNode<T> {
    private LinearNode next;
    private T element;
    
    public LinearNode(){
        next = null;
        element = null;
    }
    public LinearNode(T elem){
        next = null;
        element = elem;
    }
    public LinearNode<T> getNext(){
        return next;
    }
    public void setNext(LinearNode<T> node){
        next= node;
    }
    public T getElement(){
        return element;
    }
    public void setElement(T elem){
        element=elem;
    }
    
}
