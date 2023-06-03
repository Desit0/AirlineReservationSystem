/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem;

/**
 *
 * @author Desi
 */
public class Stack {
    
    Node head;
    
    public Stack (){
        
}
   
    public int peek (){
        
        if(head==null){
            
            return 0;
            
            
        }
        return this.head.getData(); //pokazwa poslednata stoinost na stack, bez da q premahwa
    }
    
    public void push(int data){ //dobawqne na element
        
        head = new Node(data,head);
          
    }
    
    public void pop (){ //premahwane na posledniq element
        
        if(head==null){
            
            System.out.println("you have no items in the stack");
        }
        
        head=head.getNext();
        
    }
    
    public int size (){ //duljina na stack
        
        if(head==null){
            
            return 0;
            
        } else{
            
            Node node = head;
            int size = 0;
            
            while(node.next != null){
                
                size++;
                node = node.next;
            }
            
            return size;
        }
        
        
        
    }
    
    public boolean contains (int data){ //prowerqwa dali naprimer 3 se sudurja w stack - a
        
        int counter = 0;
        Node node = head;
        
      for(int i=0; i<size(); i++){
          
          if(node.getData() == data){
              
              counter++;
          }
          
          node = node.getNext();
          
      }  
        
       if(counter == 0){
           
           return false;
       } 
       else{
           
           return true;
       }
       
    }
    
    
    public void clear(){
        
        for(int i=0; i<size(); i++){
            
            head.setData(0);
            head = head.next;
        }
        
    }
    
    Node partition (Stack c, Node start, Node end){
        
        if(start==null || start==end || start==end.next){
            
            return start;
            
            
        }
        else{
            
            Node tempkl = start;
            Node curr = start;
            int pivotel = end.getData();
            
            while (start != end) {
            if (start.getData()<= pivotel) {
                tempkl = curr;
                int temp = curr.getData();
                curr.setData(start.getData());
                start.setData(temp);
                curr = curr.next;
            }
            start = start.next;
        }
        int temp = curr.getData();
        curr.setData(pivotel);
        end.setData(temp);
       
        return tempkl;
        }
         
        
        
    }
    
    
    void sortirovka(Stack myList, Node start, Node end) {
        if (start == null || start == end || start == end.next){
            return;
        }


        Node endpartforpivot = partition(myList,start, end);
        sortirovka(myList,start, endpartforpivot);


        if (endpartforpivot != null && endpartforpivot == start) {
            sortirovka(myList,endpartforpivot.next, end);
        }

        else if (endpartforpivot != null && endpartforpivot.next != null) {
            Node kl = endpartforpivot.next;
            sortirovka(myList,kl.next, end);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
