/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

//import java.util.Iterator;

//import Nodos.Cola;
//import Nodos.Nodo;
//import java.util.Iterator;

//import colas.Desifrados;
import Arboles.BinaryTreeNode;
import Arboles.Juegomemoria;
import Arboles.LinkedBinarySearchTree;
import Arboles.LinkedBinaryTree;
import colas.QueueADT;
//import proyectos.BusquedaOrdenamiento;
import java.util.Iterator;
import colas.ArrayQueue;
import colas.Customer;
import colas.LinkedQueue;
import Arboles.BinarySearchTreeList;

/**
 *
 * @author luis_
 */
public class Proyectos {

    /**
     * @param   line arguments
     */
    public static void main(String[] args) {
      
        Juegomemoria jm = new Juegomemoria();
        jm.ejecutar("perro");
        
        //LinkedBinarySearchTree<Integer> arbol = new LinkedBinarySearchTree<Integer>();
//        BinarySearchTreeList arbol= new BinarySearchTreeList();
//        arbol.addElement(5);
//        arbol.addElement(3);
//        arbol.addElement(10);
//        aladrarbol.addElement(7);
//        arbol.addElement(12);
//        arbol.addElement(11);
//        arbol.addElement(8);
//        arbol.addElement(13);
//        arbol.removeElement(10);
//        System.out.println(arbol.contains(10));
//        System.out.println("inorder");
//        Iterator it=arbol.iteratorInOrder();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
////        arbol.removeAllOCurrences(10);
//        arbol.removeFirst();
//        arbol.removeLast();
//        System.out.println(arbol.removeFirst());
//        System.out.println(arbol.removeLast());
      //  System.out.println(arbol.findMin());
      //  arbol.size();
    //    System.out.println(arbol.size());
        
        //examen
        
//         LinkedBinaryTree<String> pro = new LinkedBinaryTree<String>("B",
//                new LinkedBinaryTree<String>("D"), new LinkedBinaryTree<String>("E"));
//
//        LinkedBinaryTree<String> arbol1 = new LinkedBinaryTree<String>("A",
//                pro, new LinkedBinaryTree<String>("C"));
//
//        System.out.println("InOrden");
//        Iterator it = arbol1.iteratorInOrder();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        System.out.println("PreOrden");
//        Iterator it2 = arbol1.iteratorPreOrder();
//        while (it2.hasNext()) {
//            System.out.println(it2.next());
//        }
//        System.out.println("PostOrden");
//        Iterator it3 = arbol1.iteratorPostOrder();
//        while (it3.hasNext()) {
//            System.out.println(it3.next());
//        }
        
//        BinaryTreeNode<Integer> arbol = new BinaryTreeNode<Integer>(5);
//        arbol.left= new BinaryTreeNode<Integer>(2);
//        arbol.rigth=new BinaryTreeNode<Integer>(6);
//        arbol.left.rigth=new BinaryTreeNode<Integer>(4);
        
        
        
        
        
        //nodos colas
//          Cola col = new Cola();
//          col.Insertar(11);
//          col.Insertar(25);
//          col.Insertar(3);
//          col.Insertar(4);
//          col.Insertar(5);
//          col.pop();
//          col.extraer();
//          col.extraer();
//          col.extraer();
        //sifrados
        
//        LinkedQueue lq = new LinkedQueue();
//        lq.enqueue(lq);
//        lq.dequeue();
//        int[] key ={5,12,-3,8,-9,4,10};
//           Integer keyValue;
//           String encoded="";
//           String decoded="";
//           String message="Este mensaje se va encriptar";
//           LinkedQueue<Integer> keyQueue1=
//                   new LinkedQueue<>();
//           LinkedQueue<Integer> keyQueue2=
//                   new LinkedQueue<>();
//           
//                for(int scan=0; scan<key.length; scan++){
//               keyQueue1.enqueue(new Integer(key[scan]));
//               keyQueue2.enqueue(new Integer(key[scan]));
//           }
//           //codificar mensaje
//           for (int scan = 0; scan < message.length(); scan++) {
//            keyValue= keyQueue1.dequeue();
//            encoded += (char) ((int)message.charAt(scan)
//                    +keyValue.intValue());
//            keyQueue1.enqueue(keyValue);
//        }
//               for (int scan = 0; scan < encoded.length(); scan++) {
//            keyValue= keyQueue2.dequeue();
//            decoded += (char) ((int)encoded.charAt(scan)
//                    -keyValue.intValue());
//            keyQueue2.enqueue(keyValue);
//        }
//               System.out.println(encoded);
//               System.out.println(decoded);

        // esto es bingo ball
//        
//     //   bingoBall a = new bingoBall(1);
//        bingoBall b = new bingoBall(20);
//        bingoBall c = new bingoBall(35);
//        bingoBall d = new bingoBall(35);
//        ArraySet<String> arreglo = new ArraySet<String>(5);
//        arreglo.add("juan");
//        arreglo.add("juan");
//        arreglo.add("coco");
//        arreglo.add("coco");
//
//        System.out.println(arreglo.size());
//        
//        Iterator t = arreglo.interator();
//        while (t.hasNext()){
//            System.out.println(t.next());
//        }
//        ArraySet<String> arreglo = new ArraySet<String>(4);
//        arreglo.add("corona");
//        arreglo.add("corona");
//        arreglo.add("victoria");
//
//        Integer[] a=new Integer[5];
//        a[0] = 4;
//        a[1] = 2;
//        a[2] = 7;
//        a[3] = 6;
//        a[4] = 9;
//        
//        BusquedaOrdenamiento<Integer>buscar=new BusquedaOrdenamiento<Integer>();
//        System.out.println(buscar.linearSearch(a, 0, 2, 6));
//         Persona p = new Persona();
//         Persona p1 = new Persona();
//         p.name = "alex";
//         p1.name = "david";
//         
//         p.next = p1;
//         p1.next = p;
//         
//         System.out.println();
//     ArrayStack pi = new ArrayStack(4);
//        pi.push(1);
//        pi.push(5);
//        pi.push(4);
//        pi.push(3);
//        pi.push(2);
//        
//        System.out.println("pop "+pi.pop());
//        System.out.println(" "+pi.peek());
//        System.out.println(" "+pi.isEmpty());


        
             
//           int[] key ={5,12,-3,8,-9,4,10};
//           Integer keyValue;
//           String encoded="";
//           String decoded="";
//           String message="Este mensaje se va encriptar";
//           ArrayQueue<Integer> keyQueue1=
//                   new ArrayQueue<>();
//           ArrayQueue<Integer> keyQueue2=
//                   new ArrayQueue<>();
//           
//           
//           for(int scan=0; scan<key.length; scan++){
//               keyQueue1.enqueue(new Integer(key[scan]));
//               keyQueue2.enqueue(new Integer(key[scan]));
//           }
//           //codificar mensaje
//           for (int scan = 0; scan < message.length(); scan++) {
//            keyValue= keyQueue1.dequeue();
//            encoded += (char) ((int)message.charAt(scan)
//                    +keyValue.intValue());
//            keyQueue1.enqueue(keyValue);
//        }
//           System.err.println(encoded);
         
       // cajero

//           final int PROCESS= 120;
//           final int MAX_CASHIERS=10;
//           final int MAX_CUSTOMER=100;
//           
//           Customer customer;
//           ArrayQueue<Customer> customerQueue = new ArrayQueue<>();
//           int[] cashierTime= new int[MAX_CASHIERS];
//           int totalTime, avergaTime, departs;
//           //procesa la simulacion para N cajero
//           for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++) {
//            //configuramos el tiempo inicial de cada cajero en 0
//               for (int count = 0; count < cashiers; count++) {
//                   cashierTime[count]=0;
//               }
//               //cargar coloa de clientes
//               for (int count = 1; count <= MAX_CUSTOMER; count++) {
//                   customerQueue.enqueue(new Customer(count*15));
//                   
//               }
//               totalTime=0;
//               //procesar todos los clientes de la cola
//               while (!(customerQueue.isEmty())){
//                   for (int count = 0; count <= cashiers; count++) {
//                       if(!(customerQueue.isEmty())){
//                           customer=customerQueue.dequeue();
//                           if(customer.getArrivalTime()>cashierTime[count]){
//                               departs= customer.getArrivalTime()+PROCESS;
//                           }else{
//                               departs=cashierTime[count]+PROCESS;
//                           }
//                           customer.setDepartureTime(departs);
//                           cashierTime[count]=departs;
//                           totalTime += customer.totalTime();
//                       }
//                       
//                   }
//               }
//               //mostramos resultados
//               avergaTime= totalTime/MAX_CUSTOMER;
//               System.out.println("Number of cashiers: " +(cashiers+1));
//               System.out.println("Average Time: " + avergaTime + "\n");
//        }


               
          
        
            
    }
}
