import java.util.*;
public class App {
   public  static class Edge{
    int source; 
    int destination;
    int weight;
    
    public Edge(int source, int destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
 }

    public static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;

        public Pair(int vertex, int cost){
            this.vertex = vertex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;  // assending order.
        }
    }
   public static void createGraph(ArrayList<Edge> graph []){
    for(int i = 0; i < graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 15));
    graph[0].add(new Edge(0, 3, 30));

    graph[1].add(new Edge(1, 0, 10));
    graph[1].add(new Edge(1, 3, 40));

    graph[2].add(new Edge(2, 0, 15));
    graph[2].add(new Edge(2, 3, 50));

    graph[3].add(new Edge(3, 0, 30));
    graph[3].add(new Edge(3, 1, 40));
    graph[3].add(new Edge(3, 2, 50));
    
   }

   public static void prims(ArrayList<Edge> graph[]){    // O(V + E).
    boolean vis[] = new boolean[graph.length];
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    int finalCost = 0;  // MST Cost OR total min weight.
    while(!pq.isEmpty()){
        Pair curr = pq.remove();
        if(!vis[curr.vertex]){
            vis[curr.vertex] = true;
            finalCost += curr.cost;
            
            for(int i = 0; i < graph[curr.vertex].size(); i++){
                Edge e = graph[curr.vertex].get(i);
                pq.add(new Pair(e.destination, e.weight));
            }
        }
     }
     System.out.println(  " Min. weight of Min. spanning Tree: "+finalCost);
   }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 
        int V = 4;

        /*              15
         *       0-------------2
         *       | \           |
         *       |   \         |
         *     10|     \30     |50
         *       |       \     |
         *       |         \   |
         *       1-------------3
         *              40
         */
       ArrayList<Edge> graph [] = new ArrayList[V];
       createGraph(graph);
       prims(graph);

    }
}
