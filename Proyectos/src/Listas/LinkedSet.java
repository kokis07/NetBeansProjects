/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.EmptyStackException;
import proyectos.SetADT;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author luis_
 */
public class LinkedSet<T>  implements SetADT<T>{
    private static  Random rand = new Random();
    private int count;
    private LinearNode<T> contents;
    
    public LinkedSet(){
        count = 0;
        contents = null;
        
    }
    
    
    

    public void add(T element) {
        if(!contains(element)){
            LinearNode<T> node = new LinearNode<T>(element);
            node.setNext(contents);
            contents=node;
            count++;
        }
            }

    @Override
    public void addAll(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeRandom() {
       LinearNode<T> previous, current;
       T result = null;
       if(isEmpty()){
           throw new EmptyStackException();
       }
       int choice = rand.nextInt(count)+1;
       if(choice==1){
           result = contents.getElement();
           contents=contents.getNext();
       }else{
           previous= contents;
           for(int skip=2; skip< choice; skip++){
               previous= previous.getNext();
           }
           current= previous.getNext();
           result= current.getElement();
           previous.setNext(current.getNext());
       }
       count--;
       return result;
    }

    @Override
    public T remove(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> interator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tosString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private LinearNode<T> setNext(LinearNode<T> next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

