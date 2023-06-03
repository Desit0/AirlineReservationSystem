/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Desi
 */
public class Node {
    
    public int data;
    public Node next;
 
    public int getData() {
        return data;
    }

    public void setData(int data1) {
        this.data = data1;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next1) {
        this.next = next1;
    }
    
    public Node (int data1, Node next1){
        
        setData(data1);
        setNext(next1);
        
    }
    
    
    
    
    
    
    
    
    
}
