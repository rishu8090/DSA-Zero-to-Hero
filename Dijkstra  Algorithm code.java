import java.util.*;
public class App {

    public static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int wt){
            this.source = s;
            this.destination = d;
            this.weight = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair>{
        int n;  // Node.
        int path; // Shortest Path.

        public Pair(int n , int path){
            this.n = n;
            this.path =path;
        }
        @Override
        public int compareTo(Pair p2){
           return this.path - p2.path; // gives assending order.
        }
    }
    
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];  // dist[i] = dist from src to i.
        for(int i = 0; i < graph.length; i++){
            if( i != src){  // all assign to infinity except src.
                dist[i] = Integer.MAX_VALUE; // infinity.
            }
        }

        boolean vis[] = new boolean [graph.length]; // visited OR not.
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));   // At Start, we goes from src to src.

        // Loop of BFS
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){  // curr pair(node , path).
                vis[curr.n] = true;
                for(int i = 0; i < graph[curr.n].size(); i++ ){
                    Edge e = graph[curr.n].get(i);
                    int u = e.source;   //  u = source.
                    int v = e.destination;  // v = destination.
                    int wt = e.weight;  // wt = weight of u to v.

                    if(dist[u] + wt < dist[v]){ // Update distance src to V;
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        // Print all source to vertices shortest distance;
        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         *            7 
         *      ^1-------->3 
         *     / |         ^  \
         *   2/  |         |  1\
         *   /   |         |    \.
         *   0  1|         |     5
         *    \  |         |   ^
         *    4\ |.   3    | 5/   
         *      \>2------->4
         * 
         */

        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        dijkstra(graph, src);
    }
}
