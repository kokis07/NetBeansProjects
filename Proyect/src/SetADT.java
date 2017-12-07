/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;// interface interator
/**
 *
 * @author luis_
 */
public interface SetADT <T> {
    
    //T = tipo estracto 
    //añade un elemento
    public void add(T elemet);
    
    public void addAll(SetADT<T>set);
    
    //elimina y devuelve un elemento alatorio
    public T removeRandomo(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        int choice=
    }
    
    //elimina y devuelve el elemento especificado 
    public T remover(T element);
    
    //devuelve la union de este conjunto y del parametro 
    public SetADT<T> union(SetADT<T> Set);
    
    //devuelve true si contiene el parametro
    public boolean contains(T element);
    
    //devuelve true si esta cinjunto y el parametro 
    //contienen exactamente los mismos elementos 
    public boolean equals(SetADT<T>Set);
    
    public boolean isEmpty();
    
    public int size();
    
    //devuelve un interator 
    public Iterator<T> interator();
    
    public String toString();
    
}
