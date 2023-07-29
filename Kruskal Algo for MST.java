import java.util.*;
public class App {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;  // vertices not edge.
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i = 0; i < n; i++){
            par[i] = i;
        }
    }
        public static int find(int x){
            if(x == par[x]){
                return x;
            }
           return  par[x] =  find(par[x]); // compression step for-> O(n) -> O(1) T.C.
        }

        public static void union(int a, int b){
            int parA = find(a);
            int parB = find(b);

            if(rank[parA] == rank[parB]){  // if rank equals
                par[par[b]] = par[a];
                rank[parA]++;           // change rank of ParA +1
            }else if(rank[parA] < rank[parB]){
                par[par[a]] = par[b];    // here rank does'nt change bcz rank of parB is already large.
            }else{
                par[par[b]] = par[a];
            }
        }

        public static void kruskal(ArrayList<Edge> edges, int V){   // T.C. -> O(V + E*logE).
            init();
            Collections.sort(edges);
            int mstCost = 0;
            int count = 0;

            for(int i = 0; count < V-1; i++){
                Edge e = edges.get(i);
                // (src, dest, wt).
                int parA = find(e.src);  // src = a.
                int parB = find(e.dest);  // dest = b.
                if(parA != parB){
                    union(e.src,  e.dest);
                    mstCost += e.wt;
                    count++;
                }
            }
            System.out.println(mstCost);
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskal(edges, V);
    }
}
