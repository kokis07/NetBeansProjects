/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author luis_
 */
public class LinkedQueue<T> implements QueueADT<T>{
     private int count;//almacena la cantidad de elementos que hay en la cola
    private LinearNode<T> leer;//lee  el contenido
    private LinearNode<T> inicio;//almacena el primer elememto en la cola

    public LinkedQueue() {//contructor
        this.count = 0;//inicia la cuenta en 0
        this.leer = null;//inicia el contenido en nulo
        this.inicio = null;//inicia el primer elementon en nulo
    }
     public void enqueue(T element) {//añade un elemto al final de la cola
        LinearNode<T> temp = new LinearNode<T>(element);//crea un nodo temporal
        if (isEmty()) {//si esta vacio
            inicio = temp;//el inicio de la cola sera el nodo apunta al siguiente elemento
        } else {
            leer.setNext(temp);//rear apunta al suiguiente eleemnto
        }
        leer = temp;//rear es igual al nodo aobtiene el elemento
        count++;//se incremeta
    }
    
    public T dequeue() {
         T result = inicio.getElement();//el inicio obtiene el elemento
        inicio = inicio.getNext();//obtiene el siguiente elemento
        count--;//la cantidad se disminuye
        return result;//Retorna al siguiente elemeto
    }

    @Override
    public T first() {
        return inicio.getElement();//regresa el elmento del inicio
    }

    @Override
    public boolean isEmty() {
        return (count == 0);//retorana verdarero o falso (falso)
    }

    @Override
    public int size() {
       return count;//regresa la cantidad
    }
    @Override
    public String toString() {//devuele una representacion en cadena de la cola 
        LinearNode<T> current = inicio;//crea 
        String cola = "";//variable string para tipo cadena 
        for (int i = 0; i < count; i++) {//recorre i hasta que se el total del contenido
            cola += "[" + current.getElement() + "]";//almacena en un acumulador el elemento que esta situado al inicio
            current = current.getNext();
        }
        return cola;//regresa el valor del incio de la cola en String
    }
    
}
