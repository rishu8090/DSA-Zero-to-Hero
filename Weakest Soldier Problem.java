import java.util.*;
public class App {

    static class Row implements Comparable<Row>{
        int soldiers;
        int index;

        public Row(int soldiers, int index){
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2){
             if(this.soldiers == r2.soldiers){
                return this.index - r2.index;  // for assending order.
             }else{
                return this.soldiers - r2.soldiers;  // reverse the order for desending.
             }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int soldiers[][] =
                            {{1,0,0,0},
                            {1,1,1,1},          // coditions for weak
                            {1,0,0,0},   // 1. Row has low no. of soldiers in it 
                            {1,0,0,0}};   // 2. if 2 rows has same no. soldiers then which row has low index will treat,
                                             //  as  weak row. 
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i = 0; i < soldiers.length; i++){
            int count = 0;  // here we done , only count the no.of soldiers in a particular row.
            for(int j = 0; j < soldiers[0].length; j++){
                count += soldiers[i][j] == 1 ? 1 :0;     
            }
            pq.add(new Row(count, i));
        }
         
        for(int i = 0; i < k; i++){
            System.out.println("R" + pq.remove().index);
        }
    }
}
