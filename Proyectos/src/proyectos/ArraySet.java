/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;


/**
 *
 * @author luis_
 */
public class ArraySet<T> implements SetADT<T> {

    //static no se necesita crear el objeto, sera compartido en las clases
    //valor semilla genera valores aleatoreos, es recomendable usar la misma semilla
    private static Random ran = new Random();
    private final int DEFAULT_CAPACITY = 100;//capicidad por default del elemento, se va aumentado automaticamente.
    private final int NO_FOUND = -1;//nos va  servir para marcar cuando no encontremos un eletos
    private int count;//cuenta los elementos que tenemos.
    private T[] contents;//contiene a los elementos.  se convierte al tipo de dato que contiene

    //se puede agragar dos constructores 
    public ArraySet() {//constructor sin parametros.
        count = 0;//inicializa count en 0
        contents = (T[]) (new Object[DEFAULT_CAPACITY]);//crea el objeto con la capasidad por default.
    }
    //object clase generica todas las clases se heredan de object-

    public ArraySet(int initialCapacity) {//el constructor con un parametro
        count = 0;//incializa count en 0
        contents = (T[]) (new Object[initialCapacity]);//inicia el objeto con la capacidad inicial(100).
    }

    @Override
    public void add(T element) {//agrgar las pelotitas
        if (!contains(element)) {//verificar si lo contiene.
            //si so iguales espande.
            if (size() == contents.length) {//si ya lo tiene agregado.
                //size devuelve cuantos elemetos ya tiene agregados
                //si ya se lleno
                expandCapacity();//va a expandir ña cantidad del arreglo
            }
            contents[count] = element;//total de elementos.
            count++;//suma 1 al arreglo.
        }
    }

    private void expandCapacity() {//expande la capacidad.
        T[] large = (T[]) (new Object[contents.length * 2]);//crea un nuevo arreglo y lo incializa con el doble de capacidad que el anterior.
        for (int i = 0; i < contents.length; i++) {
            large[i] = contents[i];//almacena.
        }
        contents = large;//lo remplaza y expande la capacidad.
    }

    public void addAll(SetADT<T> set) {//recibe otro arreglo y lo une al otro.
        Iterator<T> scan = set.interator();//de set ingreso a su iterator se alamcena en scan
        while (scan.hasNext()) {//recorre el iterator
            add(scan.next());//con add se agrega
        }
    }

    @Override
    public T removeRandom() {
        if (isEmpty()) {//si esta vacio genera un erro
            throw new EmptyStackException();//error
        }
        int choice = ran.nextInt(count);//rand!...genera un numero aleatorio. lo guarda en choise
        T result = contents[choice];//guarda co[ch] en result
        contents[choice] = contents[count - 1];//sutituye
        contents[count - 1] = null;//lo mueve.
        count--;//disminuye.
        return result;
    }

    @Override
    public T remove(T element) {
        int search = NO_FOUND;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        for(int index=0; index<count && search == NO_FOUND;index++){
            if(contents[index].equals(element)){
                search=index;
            }
        }
        if(search==NO_FOUND){
            throw new NoSuchElementException();
        }
        T result = contents[search];
        contents[search]=contents[count-1];
        contents[count-1]=null;
        count--;
        return result;
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T target) {
        int search = NO_FOUND;
        
        for (int index = 0; index < count && search == NO_FOUND; index++) {
            if (contents[index].equals(target)) {
                search = index;
            }
        }
        return (search != NO_FOUND);
    }

    @Override
    public boolean equals(SetADT<T> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {//verifica que no hay pelotitas.
        return (count == 0);//devuelve un valor booleano si count es 0.
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> interator() {
        return new ArrayIterator<T>(contents,count);
    }

    @Override
    public String tosString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    

