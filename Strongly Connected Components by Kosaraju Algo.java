import java.util.*;
public class App {
    public static class Edge{
        int source; 
        int dest;
        public Edge(int s, int d){
            this.source = s;
            this.dest = d;
        }
    }

        public static void createGraph(ArrayList<Edge> graph[]){
            for(int i = 0; i < graph.length; i++){
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 2));
            graph[0].add(new Edge(0, 3));
            graph[1].add(new Edge(1, 0));
            graph[2].add(new Edge(2, 1));
            graph[3].add(new Edge(3, 4));
        }

        public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
            vis[curr] = true;
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    topSort(graph, e.dest, vis, s);
                }
            }
            s.push(curr);
        }

        public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]){
            vis[curr] = true;
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    DFS(graph, e.dest, vis);
                }
            }
        }

        public static void kosaraju(ArrayList<Edge> graph[] ,int V){  // O(V + E).
            //Step 1 -> get nodes in stack(topological Sort).
            Stack<Integer> s = new Stack<>();
            boolean vis[] = new boolean[V];
            for(int i = 0; i <V; i++){
                if(!vis[i]){
                    topSort(graph, i, vis, s);
                }
            }

            // Step 2 -> TransPose the graph and make a new graph named transpose.
            ArrayList<Edge> transPose[] = new ArrayList[V];
            for(int i = 0; i < graph.length; i++){
                vis[i] = false; // make false for reuse;
                transPose[i] = new ArrayList<Edge>();   // created new AL of Edge type.
            }

            for(int i = 0; i < V; i++){
                for(int j = 0; j < graph[i].size(); i++){
                    Edge e = graph[i].get(j);
                    // reversing step -> dest -> source.
                    transPose[e.dest].add(new Edge(e.dest, e.source));
                }
            }

            // Step 3 -> Do DFS acc. to stack nodes on the transpose graph.
            while(!s.isEmpty()){
                int curr = s.pop();
                if(!vis[curr]){
                    System.out.print("SCC ->");
                    DFS(transPose, curr, vis);
                    System.out.println();
                }
            }

        }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
