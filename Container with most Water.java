import java.util.*;
public class App {

    public static int storeWater(ArrayList<Integer>height){  // Brute Force.

        int maxWater = 0;
        for(int i = 0; i <height.size();i++){
            for(int j = i+1; j< height.size(); j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                 int currWater = ht*width;
                 maxWater = Math.max(currWater,maxWater);
            }
        }
         return maxWater;
    }

    public static int mostWater(ArrayList<Integer>height){  // 2 pointer approch.
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        // calculate area.
        while(lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // updating pointers
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(storeWater(height));
        System.out.println(mostWater(height));
    }
}
