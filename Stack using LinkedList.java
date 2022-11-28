import java.util.*;
import java.util.LinkedList;
public class App { 
              // by default, java intialise size of linkedlist to 0;
    
        static class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                this.next = null;    
        }
    }
     static class Stack{
        static Node head = null;
     
     // isEmpty.
     public static boolean isEmpty(){
        return head == null;
     }
     // push.
     public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     // pop.
     public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
     }
     //peek.
     public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
     }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
  
}
