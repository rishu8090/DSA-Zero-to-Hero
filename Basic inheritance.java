public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Fish Luna = new Fish();
        // Luna.eats(); // single inheritance
        // Luna.swim();

        // breade kuta = new breade();// Multilevel inheritance
        // kuta.eats();
        // kuta.legs = 4;
        // System.out.print(kuta.legs);

        Birds chidiya = new Birds(); // Hierarchial inheritance
        chidiya.Fly();


    }
}
    class Animal{
        String skincolour;
      //  skincolour = "yellow";
        void eats(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathe");
        }
    }

    class Fish extends Animal{
         void swim(){
            System.out.println("Swim");
         }   
    }

    class Birds extends Animal{
        void Fly(){
            System.out.print("Fly");
        }
    }

    class Mammal extends Animal{
        void Mammal(){
            System.out.print("Walk");
        }
    }

    // class Mammal extends Animal{
    //     int legs;
    // }
    // class breade extends Mammal{
    //     String german;
    // }