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

         // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));
        
        // 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4 vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        // 2's neighbours
      /*   for(int i =0; i <graph[2].size(); i++){
            Edge e = graph[2].get(i); //{s,d,w}
            System.out.println(e.destination);
        }
         */

    }

    public static boolean isBipartite(ArrayList<Edge> graph []){
        int col[] = new int[graph.length];
        for(int i =0; i < col.length; i++){
            col[i] = -1; // no colour.
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < graph.length; i++){
            if(col[i] == -1){  // Bfs 
                q.add(i);
                col[i] = 0; //  0 = yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0; j < graph[curr].size(); j++ ){
                        Edge e = graph[curr].get(j); // e.dest

                        if(col[e.destination] == -1){  // Case : 3.  
                            int nextCol = col[curr] == 0 ? 1 : 0; // if 0 then 1, OR 1 then 0.
                            col[e.destination] = nextCol;
                            q.add(e.destination);
                        }
                        else if(col[curr] == col[e.destination]){  // Case : 1.
                            return false;
                        }
                        // case 2 : continue.
                    }
                }
            }
        }
        return true;

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         *                  0 
         *                 / \
         *                /   \
         *               1     2         // 1. All non-cyclic graph are bipartite.
         *               |     |        //  2. All Even cyclic graph are Bipartite.
         *               |     |       //   3. All odd cyclic graph are always not Bipartite.
         *               3-----4
         */

          int V = 5;
        // int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; // here AL is empty = null;

        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
