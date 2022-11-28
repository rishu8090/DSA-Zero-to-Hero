                  // import java.util.LinkedList;
import java.util.*;                              

    public class LinkedList{ 
        public static Node head;
        public static Node tail;
        public static int size;     // by default, java intialise size of linkedlist to 0;
    
        public static class Node{
            int data;
            Node next;
            public Node(int data){
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
        
        public void addFirst(int data){
            // step 1; creating a new Node
            Node newNode = new Node(data);
            size++;    // size is always used after New node creation.
            
            if(head == null){  // if LinkedList is empty.   
                head = tail = newNode;
                return;
            }
            // step =2. assign newnode.next to head;
            newNode.next = head;
            //  step = 3  .newNode = head;
            head = newNode;  
        }
        
        public void addLast(int data){
            // step 1; creating a new Node
            Node newNode = new Node(data);
            size++;
             
            if(head == null){
                head = tail = newNode;
                return;
            }
            // step =2. assign newnode.next to tail;
            tail.next = newNode;
            //  step = 3  .newNode = tail;
            tail = newNode;  
        }
        
        public void addMid(int index , int data){
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;

            if(index == 0){
                addFirst(data);
                return;
            }
            while(i < index-1){
                temp = temp.next;
                i++;
            }
            // i = index-1; temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public int RemoveFirst(){
            if(size == 0){
                System.out.print("Linked list is empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val ;
        }
        
        public int RemoveLast(){
            if(size == 0){
                System.out.print("Linked list is empty");
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
            }
             Node Prev = head;
             for(int i =0; i < size-2; i++){
                Prev = Prev.next;
             }
            // int val = Prev.next.data;   // tail's data.
             Prev.next = null;
             tail = Prev;
             size--;
            return val;
        }

        public int itrSearch(int target){   /// iterative search
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == target){
                    return i;
                } 
                   temp = temp.next;
                    i++;
            }
            return -1;   // if target is not found;
        }
        public int recSearch(Node head , int target){   
            if(head == null){
                return -1;  // base case;
            }
            if(head.data == target){
                return 0;   // case found 
            }
            int index = recSearch(head.next , target);
            if(index == -1){  
                return -1;
            }
            return index+1;   // for backtracking.    
        }
         

        public void reverse(){
            Node prev = null;  // node before  head, is by default null;
            Node curr =tail = head;
            Node next;
        
            while(curr != null){
                next = curr.next;
                curr.next = prev;  // reversing step.
                prev = curr;
                curr = next;
            }
            head = prev;
        } 

        public void deleteNthFromEnd(int n){     /// delete from mid.
            // calculate size of linked list.
            int sz =0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }
            if( n ==  sz){   // if we deleing head node
                head = head.next;   // remove first.
                return;
            }
            // for all cases.
            int i = 1;
            int iToFind = sz-n;
            Node prev = head;
            while(i < iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

        public Node FindMid(Node head){    // helper function for ll.palindrome.
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;        // +1
                fast = fast.next.next;  // +2
            }
            return slow; // slow is our midNode.
        }

        public boolean palindrome(){
            // step -1 = find mid;
            Node midNode = FindMid(head);

            // step 2 = reverse the 2nd half .
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  // 2nd half head.
            Node left = head;   // 1st half head.

            // step 3 = check left and right half for palindrome.
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        
        /// Merged Sort for an LinkedList.
        public Node getMid(Node head){
            Node fast = head.next;  // here , this line , bcz we wnat , if a Linked list of 6,
            Node slow = head;   // the element at 4 place count in the 2nd half .
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;   // slow is equal to mid.
        }
            public Node merge(Node head1 , Node head2){
                Node mergeLL = new Node(-1);
                Node temp = mergeLL;
                while(head1 != null && head2 != null){
                    if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                    }else{
                        temp.next = head2;
                        head2 = head2.next;
                        temp = temp.next;
                    }
                }
                while(head1 != null){      // for remaining elements in 1st half.
                    temp.next = head1;    
                    head1 = head1.next;
                    temp = temp.next; 
                }
                while(head2 != null){      // for remaining elements in 1st half.
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
                return mergeLL.next;   // .next is used to remove -1 from the ans LinkedList.
            }

        public Node mergeSort(Node head){
            if(head == null ||  head.next == null){    // base case.
                return head;
            }
            // step 1 : to find mid .
            Node mid = getMid(head);
            // Step 2 : to sort left and right part.
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);   // sort the left part.
           Node newRight = mergeSort(rightHead); // sort the right part.

            // Step 3 : to merge the the two sorted parts.
            return merge(newLeft , newRight);
            
        }

        public void zigzagMerge(){
            // Step 1: to find the mid;
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // Step 2: to reverse the 2nd half.
            Node curr = mid.next;
            mid.next = null;  // for breaking LL is two parts.
            Node prev = null;
            Node next;
            while(curr != null){
              next =  curr.next;
              curr.next = prev;
              prev = curr;
              curr = next; 
            }
            Node left = head;   //left Head
            Node right = prev;  // right Head
            Node nextLeft , nextRight;

            // Step 3 : Zig- Zag merge the to halfs
            while(left != null && right != null){
                nextLeft = left.next;
                left.next = right;
                nextRight = right.next;
                right.next = nextLeft;

                left = nextLeft;
                right = nextRight;
            }
        }

    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(46);
        ll.addLast(5);
        // ll.addLast(2);
        // ll.addLast(1);
        //  ll.print()
        ll.addMid(2,6);
        // System.out.println(size);
        // ll.addLast(0);
    //    ll.RemoveFirst();
        //  ll.RemoveLast();
      //System.out.print(ll.itrSearch(6));
           //  System.out.print(ll.recSearch( ll.head,6));
        // ll.print();
        // ll.reverse();
    //    ll.deleteNthFromEnd(2);
    ll.print();
//    ll.head = ll.mergeSort(head);
        ll.zigzagMerge();
    ll.print();
//    System.out.print(ll.palindrome());
       // System.out.print(ll.size);

    }
}
