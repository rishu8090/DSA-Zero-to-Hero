 import java.util.*;
public class App {

    public static class Edge{
        int source;
        int destination;
        int weight;

       public Edge(int s , int d , int w){
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
            // 0 -vertex.
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));

            // 1 -vertex.
            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            // 2 -vertex
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            // 3 -vertex
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            // 4 -vertex
            graph[4].add(new Edge(4,2,1));
            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,1));

            // 5 -vertex
            graph[5].add(new Edge(5,3,1));
            graph[5].add(new Edge(5,4,1));
            graph[5].add(new Edge(5,6,1));

            //6 -vertex
            graph[6].add(new Edge(6, 5, 1));


        // 2's neighbours
        for(int i =0; i <graph[2].size(); i++){
            Edge e = graph[2].get(i); //{s,d,w}
            System.out.println(e.destination);
        }

    }

    public static void bfs(ArrayList<Edge> graph[]){   // O(V+E).
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        q.add(0);  // source/start = 0;
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visit[curr]){  // if first time comes
                System.out.print(curr + " ");  // Step 1 - print
                visit[curr] = true;           //  Step 2 - visit equals to true.

                for(int i =0; i <graph[curr].size(); i++){  // Step 3 - add curr neighb. to the queue.
                    Edge e = graph[curr].get(i);
                    q.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            /*
             *        
             *       1---3
             *      /    | \
             *     0     |  5---6
             *      \    | /
             *       2---4
             * 
             * 
             */

        int V = 7;
        // int arr[] = new arr[V];
        ArrayList<Edge>[] graph = new ArrayList[V]; // here AL is empty = null;

        createGraph(graph);
        bfs(graph);
    }
}