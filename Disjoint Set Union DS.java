import java.util.*;
public class App {
 
    static int n = 7;  // vertices not edge.
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
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}
