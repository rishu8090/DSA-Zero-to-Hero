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

    public static class Info{
        int v; 
        int cost; 
        int stops;

        public Info(int v, int cost, int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static int cheapestFlights(int V, int flights[][], int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(flights, graph);

        int dist[] = new int[V];
        for(int i = 0; i < V; i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE; // Infinity.
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)); // At Starting.

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }
            
            for(int i = 0; i < graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);   // v stands for vertex . whereas V stands for graph.length.
                int u =  e.source;
                int v = e.destination;
                int wt = e.weight;
                
                // Relaxation.
                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <= k){  // third condition,
                    dist[v] = dist[u] + wt;  // used for not run  such state where curr.stops is greater then k.
                    q.add(new Info(v , dist[u], curr.stops+1));
                }
            }
        }

        // dist[dest] = cost.
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
          return  dist[dest];
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 4;
        /*
         *             100    
         *       0<-------------2
         *       |         ^    |
         *       |       /      |
         *   100 |   100/       | 200
         *       |    /         |
         *      .|  /   600     |.
         *       1------------->3
         */
        int flights[][] = {{0,1,100}, {1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dest = 3, k = 1;
        // this question is an application of dikstra algorithm.
      System.out.println(cheapestFlights(V, flights, src, dest, k));
    }
}
