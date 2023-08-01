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
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[],
                            int time, boolean vis[]){

            vis[curr] = true;
            dt[curr] = low[curr] = ++time;
            
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);  // e.src ------ e.dest.
                int neigh = e.dest;
            // 1st condition (  not say something)
            if(neigh == par ){   // iterate next condition OR Ignore.
                continue;
            }
            // 2nd condition.(bridge condition and update).
            else if(!vis[neigh]){
                dfs(graph, neigh, curr, dt, low, time, vis);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] < low[neigh]){  // bridge condition.
                    System.out.println("Bridge is at :" + curr + "-----" + neigh );
                }
            }
            //  3rd condition (not bridge and update).
            else{  // vis[neight] == ture.
                 low[curr] = Math.min(low[curr], dt[neigh]);
            }

          }
     }
    public static void tarjanBridge(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];  // discovery time.
        int low[] = new int[V]; // lowest discovery time.
        int time = 0; 
        boolean vis[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(graph, i, V, dt, low, time, vis);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);
    }
}
