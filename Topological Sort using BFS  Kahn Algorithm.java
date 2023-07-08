import java.util.*;
public class App {
    
    public static class Edge{
        int source; 
        int destination;
        public Edge(int s , int d){
            this.source = s;
            this.destination = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcuinDeg(ArrayList<Edge> graph[], int inDeg[]){
        
        for(int i = 0; i < graph.length; i++){
            int vertics = i;
            for(int j = 0; j < graph[vertics].size(); j++){
                Edge e = graph[vertics].get(j);
                inDeg[e.destination]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph []){
        int inDeg[] = new int[graph.length];
        calcuinDeg(graph, inDeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < inDeg.length; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");  // Prints topological Sort.

            for(int i = 0; i <graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDeg[e.destination]--;
                if(inDeg[e.destination] == 0){
                    q.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         /*
         *              5 ---->0<----4
         *              |            |    
         *              |.           |.         (.) means downgoing arrow.
         *              2----->3---->1
         */
        
        int V = 6;
        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
