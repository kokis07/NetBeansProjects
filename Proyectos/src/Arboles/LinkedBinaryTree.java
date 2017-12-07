/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;


/**
 *
 * @author luis_
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T>{
    
    protected int count;

    protected BinaryTreeNode<T> root;

    public LinkedBinaryTree() {
        count = 0;
        root = null;
    }

    public LinkedBinaryTree(T element) {
        count = 1;
        root = new BinaryTreeNode<T>(element);
    }

    public LinkedBinaryTree(T element, LinkedBinaryTree<T> leftSubtree, LinkedBinaryTree<T> rightSubtree) {
        root = new BinaryTreeNode<T>(element);
        count = 1;
        if (leftSubtree != null) {
            count = count + leftSubtree.size();
            root.left = leftSubtree.root;
        } else {
            root.left = null;
        }
        if (rightSubtree != null) {
            count = count + rightSubtree.size();
            root.rigth = rightSubtree.root;
        } else {
            root.rigth = null;
        }
    }

    
    public void removeLeftSubtree() {
        if(root.left !=null){
            count = count - root.left.numChildren()-1;
           root.left=null; 
        }
    }

    
    public void removeRigthSubtree() {
       if(root.rigth !=null){
           count = count - root.rigth.hashCode()-1;
           root.rigth=null;
       }
    }

    
    public void removeAllElements() {
//        if(root.left !=null){
//            count = count - root.left.numChildren()-1;
//           root.left=null; 
//        }
//         if(root.rigth !=null){
//           count = count - root.rigth.hashCode()-1;
//           root.rigth=null;
//       }
         removeLeftSubtree();
         removeRigthSubtree();
    }

    
    public boolean isEmpty() {
        return count==0;
    }

    
    public int size() {
        return count;
    }

    
    public boolean contains(T targetElement) {
       Boolean result;
       if(findagain(targetElement, root)!= null){
           result = true;
       }else{
           result=false;
       }
       return result;
    }

    
    public T find(T targetElement) throws EmptyStackException{
        BinaryTreeNode<T> current = findagain(targetElement, root);
        if(current ==null){
            throw new EmptyStackException();
        }
        return current.element;
    }
    protected BinaryTreeNode<T> findagain(T targetElement, BinaryTreeNode<T> next){
        if(next == null){
            return null;
        }
        if(next.element.equals(targetElement)){
            return next;
        }
        BinaryTreeNode<T> temp= findagain(targetElement, next.left);
        if(temp==null){
            temp=findagain(targetElement, next.rigth);
        }
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
       ArrayList<T> templist = new ArrayList<T>();
        inorder(root, templist);
        return templist.iterator();
    }

    protected void inorder(BinaryTreeNode<T> node, ArrayList<T> templist) {
        if (node != null) {
            inorder(node.left, templist);//recorre al hijo izquierso
            templist.add(node.element);//visita a el nodo
            inorder(node.rigth, templist);//recorre al hijo derecho
        }
    }

    
    public Iterator<T> iteratorPreOrder() {
         ArrayList<T> templist = new ArrayList<T>();
        preOrder(root, templist);
        return templist.iterator();
        
     }
    
    protected void preOrder(BinaryTreeNode<T> node, ArrayList<T> templist){
        if(node != null){
            templist.add(node.element);
            preOrder(node.left, templist);
            preOrder(node.rigth, templist);
             
        }
        
    }

    
    public Iterator<T> iteratorPostOrder() {
         ArrayList<T> templist = new ArrayList<T>();
        postOrder(root, templist);
        return templist.iterator();
    }
    
    protected void postOrder(BinaryTreeNode<T> node, ArrayList<T> templist){
        if(node != null){
            preOrder(node.left, templist);
            preOrder(node.rigth, templist);
            templist.add(node.element);
        }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeRigthElements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
