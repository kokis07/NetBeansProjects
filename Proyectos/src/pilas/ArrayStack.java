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
public class ArrayStack<T> implements StackADT<T> {

    private int count;
    private T[] contents;
    private final int DEFAULT_CAPACITY = 100;
    boolean Empty;
    private final int NO_FOUND = -1;

    public ArrayStack() {//constructor sin parametros.
        count = 0;//inicializa count en -1
        contents = (T[]) (new Object[DEFAULT_CAPACITY]);//crea el objeto con la capasidad por default.
    }
    

    public ArrayStack(int initialCapacity) {//el constructor con un parametro
        count = 0;//incializa count en 0
        contents = (T[]) (new Object[initialCapacity]);//inicia el objeto con la capacidad inicial(100).
    }

    private void expandCapacity() {//expande la capacidad.
        T[] large = (T[]) (new Object[contents.length * 2]);//crea un nuevo arreglo y lo incializa con el doble de capacidad que el anterior.
        for (int i = 0; i < contents.length; i++) {
            large[i] = contents[i];//almacena.
        }
        contents = large;//lo remplaza y expande la capacidad.
    }

    public void push(T element) {
        if (size() == contents.length) {//si ya lo tiene agregado.
            //size devuelve cuantos elemetos ya tiene agregados
            //si ya se lleno
            expandCapacity();//va a expandir ña cantidad del arreglo
        }

        count++;
        contents[count] = element;
    }

    public T pop() {
        T fuera = contents[count];
        count--;
        return fuera;
    }

    @Override
    public T peek() {
        return contents[count-1];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

}
