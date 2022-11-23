import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Horse h = new Horse();
        // h.eats();
        // h.walks();
        // Chicken x = new Chicken();
        // x.eats();
        // x.walks();
        Mastang M = new Mastang();
 
    }
}
    abstract class Animal{
        Animal(){
            System.out.println("animal is called");
        }
    void eats(){
        System.out.println("eats");
    }
    abstract  void walks();   
 }
  class Horse extends Animal{
    Horse(){
        System.out.println("Horse is called");
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
    class Mastang extends Horse{
        Mastang(){
            System.out.println("Mastang is called");
        }
    }
   
    class Chicken extends Animal{
        void walks(){
            System.out.println("walks on 2 legs");
        }
    }
  