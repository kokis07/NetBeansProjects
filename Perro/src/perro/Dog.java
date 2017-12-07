/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;


/**
 *
 * @author luis_
 */
public class Dog {
   String nombre;
   int edad;
   String perro;
   
   Dog(String nom, int eda, String per){
       this.nombre = nom;
       this.edad = eda;
       this.perro = per;
   }
   
   
      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }
    
    public String toString(){
        return "el perro es el mejor amigo del hombre " + "el nombre es " + nombre + "la raza es" + perro;
    }
    
    public int edad(){
        return edad * 7;
    }
       
   
  }
    

