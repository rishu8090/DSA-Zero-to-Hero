public class App {

       static  class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty .
        public static boolean isEmpty(){
            return rear == -1;
        }
        
        // Add data to Queue.
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove data from Queue.
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty." ); 
                return -1; 
            }
            int front = arr[0];
            for(int i =0 ; i < rear ; i++){
               arr[i] = arr[i+1];  
            }
            rear = rear -1;
            return front;
        }

        // Peek function.
        public static int peek(){
            if(rear == -1){
                System.out.print("Queue is empty." ); 
                return -1; 
            }
            return arr[0];
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Queue q = new Queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
          while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
          }
    }
}   
