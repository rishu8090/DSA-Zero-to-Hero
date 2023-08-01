import java.util.*;
public class App {
    public static class Edge{
        int source; 
        int dest;

        public Edge(int src, int dest){
            this.source = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
         
        graph[4].add(new Edge(4, 3));
        
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par,     // O(V+E)
                            int dt[], int low[], int time, boolean vis[], boolean ap[]){
        
            vis[curr] = true;
            dt[curr] = low[curr] = ++time;
            int children = 0;

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                int neigh = e.dest;
                // 1st condition (not say something).
                if(neigh == par){  // iterate next condition OR Ignore.
                    continue;
                }
                // 2rd condition (not AP and update).
                else if(vis[neigh]){ 
                    low[curr] = Math.min(low[curr], dt[neigh]);
                }
                 // 3rd condition( AP and update). for !vis[neigh].
                 else{
                    dfs(graph, neigh, curr, dt, low, time, vis, ap);
                    low[curr] = Math.min(low[curr], low[neigh]);
                    if(par != -1 && dt[curr] <= low[neigh]){   // case 2 & 3.
                       ap[curr] = true; // (< is for bridge point and = is for cycle).
                    }
                    children++;
                 }
            }

            if(par == -1 && children > 1){
                 ap[curr] = true; // for case 1.
            }

     }

    public static void getAP(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];   // Discovery time.
        int low[] = new int[V]; // Lowest Discovery time.
        int time =  0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, time, vis,ap);
            }
        }

        // for printing all AP .   for such condition where AP printed more than once.
        for(int i = 0; i < V; i++){
            if(ap[i]){
                System.out.println("AP :" + i);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}
