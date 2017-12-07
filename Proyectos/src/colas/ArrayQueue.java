/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.EmptyStackException;

/**
 *
 * @author luis_
 */
public class ArrayQueue<T> implements QueueADT<T>{

    private T[] queue;
    private int rear;
    
    
    public ArrayQueue(){
        this.queue = (T[]) (new Object[5]);
        this.rear = 0;
    }
    public void enqueue(T element) {
        
        if (size()==queue.length){
            expandCapacity();
        }
        queue[rear]=element;
        rear++;
    }
    
     private void expandCapacity() {//expande la capacidad.
        T[] large = (T[]) (new Object[queue.length * 2]);//crea un nuevo arreglo y lo incializa con el doble de capacidad que el anterior.
        for (int i = 0; i < queue.length; i++) {
            large[i] = queue[i];//almacena.
        }
        queue = large;//lo remplaza y expande la capacidad.
    }

    @Override
    public T dequeue() {
        if (isEmty()){
            throw  new EmptyStackException();
        }
        T result=queue[0];
        rear--;
        //desplasar los elementos
        for(int scan=0; scan< rear; scan++){
            queue[scan]= queue[scan+1];
        }
        queue[rear]=null;
        return result;
    }

    @Override
    public T first() {
         return queue[0];
    }

    @Override
    public boolean isEmty() {
         return (rear == 0);
    }

    @Override
    public int size() {
        return rear;
    }

   public String toString(){
       String cola="";
       for (int i = 0; i < rear; i++) {
           cola +="["+queue[i]+"]";
       }
       return cola;
   }
   
}
