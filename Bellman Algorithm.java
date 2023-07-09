  import java.util.*;
public class App {
    public static class Edge{
        int source;   
        int destination;
        int weight;

       public  Edge(int source, int destination, int weight){
            this.source = source; 
            this.destination = destination;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));

    }

    public static void createGraph2(ArrayList<Edge> graph){
          graph.add(new Edge(0, 1, 2));
          graph.add(new Edge(0, 2, 4));
          graph.add(new Edge(1, 2, -4));
          graph.add(new Edge(2, 3, 2));
          graph.add(new Edge(3, 4, 4));
          graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph [], int source){
        int dist[] = new int[graph.length];
        for(int i = 0; i < dist.length; i++){
            if(i != source){
                dist[i] = Integer.MAX_VALUE;
            }
        }

       int V = graph.length;
        //  bellman ford's algo.
        for(int i = 0; i < V-1; i++ ){  // T.C. -> O(V*E).
            for(int j = 0; j < graph.length; i++){
                for(int k = 0; k < graph[j].size(); k++){ 
                    // Edge.
                    Edge e = graph[j].get(k);
                    // u,v,wt.
                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;
                    // Relaxation.
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // print.
        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void bellmanFord2(ArrayList<Edge> graph2, int source, int V){
        int dist[] = new int[V];
        for(int i = 0; i < dist.length; i++){
            if(i != source){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        //  bellman ford's algo.
        for(int i = 0; i < V-1; i++ ){  // T.C. -> O(V*E).
             for(int j = 0; j < graph2.size(); j++ ){
                    // Edge.
                    Edge e = graph2.get(j);  // same time complexibility.
                    // u,v,wt.
                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;
                    // Relaxation.
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        

        // print.
        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 5;
       // ArrayList<Edge> graph [] = new ArrayList[V];
       // createGraph(graph);
     //  bellmanFord(graph, 0 );
        ArrayList<Edge> graph2 = new ArrayList<>();
       createGraph2(graph2);
       bellmanFord2(graph2,  0, V);
    }
}
