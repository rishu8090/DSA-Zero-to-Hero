import java.util.*;
public class App {

    public static class Edge{
        int source;
        int destination;
       

       public Edge(int s , int d ){
            this.source = s;
            this.destination = d;
           
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
            // 0 -vertex.
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));
            graph[0].add(new Edge(0, 3));

            // 1 -vertex.
            graph[1].add(new Edge(1,2));
            graph[1].add(new Edge(1,0));

            // 2 -vertex
            graph[2].add(new Edge(2, 1));
            graph[2].add(new Edge(2, 0));

            // 3 -vertex
            graph[3].add(new Edge(3, 0));
            graph[3].add(new Edge(3, 4));

            // 4 -vertex
            graph[4].add(new Edge(4,3));


        // 2's neighbours
        for(int i =0; i <graph[2].size(); i++){
            Edge e = graph[2].get(i); //{s,d,w}
            System.out.println(e.destination);
        }

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis, i, -1) ){ // at starting, starting node have no parent ,so use -1;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;

        for(int i =0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // case 3
            if(!vis[e.destination]){
                if(detectCycleUtil(graph, vis, e.destination, curr)){
                    return true;
                }
            }
            // case 1
            else if(vis[e.destination] && e.destination != par){
                return true;
            }
            // case 2 (do nothing  OR Continue).
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            /*
             *            0-------3
             *          / |       |
             *         /  |       |
             *        1   |       |
             *         \  |       4
             *          \ |
             *            2
             */

        int V = 5;
        // int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; // here AL is empty = null;

        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
