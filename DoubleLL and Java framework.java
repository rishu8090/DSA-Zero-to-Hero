 import java.util.DoubleSummaryStatistics;
import java.util.*;
import java.util.LinkedList;
public class DoubleLL {
    public static Node head;
    public static Node tail;
    public static int size;

    public  class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public  int removeFirst(){
        if(head == null){
            System.out.print("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
           int val = head.data;
           head = tail = null;
           size--;
           return val; 
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
     
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while( curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.addFirst(2);
        // ll.addLast(4);
        // ll.addLast(5);
        // System.out.println(ll);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.print(ll);

        DoubleLL dll = new DoubleLL();
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        dll.reverse();
         System.out.println(dll.size);
         dll.print();

        //  dll.removeFirst();
        // dll.print();
        // System.out.print(size);
    }
}