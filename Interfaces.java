public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        king k = new king();
        k.moves();

        omnivorus beer = new omnivorus();
        beer.food();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
   public  void moves(){
    System.out.println("all directions");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("all directions but only one place");
    }
}
class pawn implements Chessplayer{
    public void moves(){
        System.out.println("only in forward direction");
    }
}
class Rock implements Chessplayer{
    public void moves(){
        System.out.println("forward and backward");
    }
}

interface harbivorus{
    public void food();
}
interface carnivorus{
    public void food();
    
}

class omnivorus implements harbivorus , carnivorus{
    public void food(){
        System.out.println("eates both ");
    }
}