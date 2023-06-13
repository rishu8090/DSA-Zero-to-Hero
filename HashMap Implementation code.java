import java.util.*;
public class App {
         static class HashMap<K, V>{  // generic type in which data item type,
             private class Node{     //  does'nt decide yet.
                K key;
                V value;

              public Node(K key, V value){
                this.key = key;
                this.value = value;
              }
             }

             private int n;  // n
             private int N;
             private LinkedList<Node> buckets[];  //N = bucket.length

             public HashMap(){

                this.N = 4;
                this.buckets = new LinkedList[4];
                for(int i = 0; i < 4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
             }

             private int hashFunction(K key){
                int hc = key.hashCode();
                return Math.abs(hc) % N;
             }

             private int searchInLL(K key ,int Bi){
                LinkedList <Node> ll = buckets[Bi];
                int Di = 0;
                for(int i = 0; i < ll.size(); i++){
                    Node node = ll.get(i);
                    if(node.key == key){
                        return Di;
                    }
                    Di++;
                }
                return -1;
             }
             
             private void rehash(){
                LinkedList<Node> oldBuck[] = buckets;
                buckets = new LinkedList[N*2];
                N = N*2;
                for(int i = 0; i < buckets.length; i++){
                    buckets[i] = new LinkedList<>();
                }

                // nodes -> add in bucket
                for(int i = 0; i < oldBuck.length; i++){
                    LinkedList<Node> ll = oldBuck[i];
                    for(int j =0; j < ll.size(); j++){
                        Node node = ll.remove();
                        put(node.key , node.value);
                    }
                }
             }   

             public void put(K key, V value){
                int Bi = hashFunction(key);
                int Di = searchInLL(key ,Bi);
            
                if(Di != -1){  // if node already exists.(Updation)
                    Node node =buckets[Bi].get(Di);
                    node.value = value;
                } else{   // for creating a new Node.
                    buckets[Bi].add(new Node(key, value));
                    n++;
                }

                double lambda = (double) n/N;
                if(lambda > 2.0){
                    rehash();
                }
             }

             public boolean containsKey( K key){
                int Bi = hashFunction(key);
                int Di = searchInLL(key ,Bi);
            
                if(Di != -1){ // for a valid value
                    return true;
                } else{   
                    return false;
                }
             }

             public V remove(K key){
                int Bi = hashFunction(key);
                int Di = searchInLL(key ,Bi);
            
                if(Di != -1){  // if node exists
                    Node node =buckets[Bi].remove(Di);
                    n--; // size--
                    return node.value;
                } else{   
                    return null;
                }
             }

             public V get(K key){
                int Bi = hashFunction(key);
                int Di = searchInLL(key ,Bi);
            
                if(Di != -1){  // if node already exists.(Updation)
                    Node node =buckets[Bi].get(Di);
                    return node.value;
                } else{   
                    return null;
                }
             }

             public ArrayList<K> keySet(){
                ArrayList<K> keys = new ArrayList<>();

                for(int i = 0; i < buckets.length; i++){
                    LinkedList<Node> ll = buckets[i];
                    for(Node node : ll){
                        keys.add(node.key);
                    }
                }
                return keys;
             }

             public boolean isEmpty(){
                return n == 0;
             }
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India" , 140);
        hm.put("China" , 150);      // W.T.C. for hashMap is O(N) when all elements are,
        hm.put("Nepal" , 5);       //  stored on a single bucket.
        //System.out.println(hm);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
