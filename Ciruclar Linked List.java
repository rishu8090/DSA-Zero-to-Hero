import java.util.*;
import java.util.LinkedList;

public class LinkedList {

    public static Node head;
    public static Node tail;
    

    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
    }
}
public  void print(){
    if(head == null){
        System.out.print("null");
        return;
    }
     Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "->");
    temp = temp.next;
    }
    System.out.println("Null");
}

    public   boolean  isCycle(){  // floyd's cycle finding algorithm.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow =  slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;   // Cycle exist.
            }
        }
        return false;  // Cycle doesn't exist.
    }

    public void removeCycle(){
        //  Step 1= to check the LinkedList is cyclic.
        Node slow = head;
        Node fast = head; 
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;      // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        // Step 2 = Find meeting point.
        slow = head;
        Node prev = null;     // slow and fast will meet again where last node of  the LinkedList , 
        while(slow != fast){      // joints in the middle of LinkedList.
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
        // Step 3 = remove cycle.
        prev.next = null;
         
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList ll = new LinkedList();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);  
        head.next.next.next = temp;     // after this LinkedList looks = 1->2->3->2
        System.out.println( ll.isCycle());
        ll.removeCycle();
        System.out.print( ll.isCycle());
    }
}
