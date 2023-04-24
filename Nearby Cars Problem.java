import java.util.PriorityQueue;

public class App {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSeq;
        int idx;
        public Point(int x, int y, int distSeq, int idx){
            this.x = x;
            this.y = y;
            this.distSeq = distSeq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2){      // sort acc. to distSeq.
           return  this.distSeq - p2.distSeq;  // for assending order.
           // reverse this condition for desending order.
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int pts[][] = {{3,3}, {5,-1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++){
            int distSeq = pts[i][0] * pts[i][0]  +  pts[i][1] * pts[i][1];  //  x^2 + y^2.
            pq.add(new Point(pts[i][0], pts[i][1], distSeq, i));
        }

        // Nearest Cars
        for(int i = 0; i < k; i++){
            System.out.println("C" + pq.remove().idx);
        }
   }
}
