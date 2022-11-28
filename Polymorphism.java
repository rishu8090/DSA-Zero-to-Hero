    public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(3,4));
        // System.out.println(calc.sum(3,4,6));  // method ovloading.
        // System.out.println(calc.sum((float)3.5,(float) 4.3));

        Cow C = new Cow();
            C.eats();
        }  
    }

    class Animal{
        void eats(){
            System.out.println("Eats anything");
        }
    }

    class Cow extends Animal{
        void eats(){
            System.out.println("Eats Grass");
        }
    }

class Calculator{
    int sum(int a , int b){
        return a +  b;
    }
    int sum(int a , int b, int c){
        return a +  b + c;
    }
    float sum(float a , float b){
        return  a + b;
    }
}

