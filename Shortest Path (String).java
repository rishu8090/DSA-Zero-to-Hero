import java.util.*;
public class App {
    public static float shortestPath(String path){
        int x =0, y =0;
        
        for(int i =0; i < path.length(); i++){
            int dir = path.charAt(i);
            //North
            if( dir == 'N'){
                y++;
            }else if( dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return  (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String path = "WNEENESENNN";
        System.out.print(shortestPath(path));
    }
}
