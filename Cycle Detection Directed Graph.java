import java.util.*;

public class App {
    public static  class Edge{
        int source;
        int destination;
         
        public Edge(int s, int d){
            this.source = s;
            this.destination = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        //  // 0 vertex         //  Graph 1 : false.
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        
        // // 1 vertex
        // graph[1].add(new Edge(1, 3));

        // // 2 vertex
        // graph[2].add(new Edge(2, 3));

        // Graph 2: true.
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3,0));
        

        // 2's neighbours
      /*   for(int i =0; i <graph[2].size(); i++){
            Edge e = graph[2].get(i); //{s,d,w}
            System.out.println(e.destination);
        }
         */
    }

    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] =true;

        for(int i =0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.destination]){
                return true;
            }
            if(!vis[e.destination] && isCycleUtil(graph, e.destination, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         int V = 5;
        // int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; // here AL is empty = null;

        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
