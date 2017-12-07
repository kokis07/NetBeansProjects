/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;


import colas.ArrayQueue;
import colas.LinkedQueue;

/**
 *
 * @author luis_
 */
public class Desifrados {
    int[] key ={5,12,-3,8,-9,4,10};
           Integer keyValue;
           String encoded="";
           String decoded="";
           String message="Este mensaje se va encriptar";
           LinkedQueue<Integer> keyQueue1=
                   new LinkedQueue<>();
           LinkedQueue<Integer> keyQueue2=
                   new LinkedQueue<>();
           
           public void Encriptar(){
                for(int scan=0; scan<key.length; scan++){
               keyQueue1.enqueue(new Integer(key[scan]));
               keyQueue2.enqueue(new Integer(key[scan]));
           }
           //codificar mensaje
           for (int scan = 0; scan < message.length(); scan++) {
            keyValue= keyQueue1.dequeue();
            encoded += (char) ((int)message.charAt(scan)
                    +keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
               System.out.println(encoded);
    }
           public void Desincriptar(){
               for (int scan = 0; scan < encoded.length(); scan++) {
            keyValue= keyQueue2.dequeue();
            decoded += (char) ((int )encoded.charAt(scan)
                    -keyValue.intValue());
            keyQueue2.enqueue(keyValue);
        }
               System.out.println(decoded);   
           } 
           
           

    
}
