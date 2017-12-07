/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;


/**
 *
 * @author luis_
 */
public class Cola {
    Nodo primero, ultimo;
    public void Insertar(int info){
        Nodo nuevo = new Nodo(info);
        nuevo.info=info;
        if(primero==null){
            nuevo.siguiente=null;
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            ultimo=nuevo;
        }
    }
    public int extraer(){
        Nodo aux = primero;
        primero=primero.siguiente;
        aux.siguiente = null;
        int resultado = aux.info;
        System.out.println("sacando el primero" + resultado);
        return resultado;
    }
    public void pop(){
        while(primero!=null){
            System.out.println("Sacando"+ primero.info);
            primero = primero.siguiente;
        }
    }
}
