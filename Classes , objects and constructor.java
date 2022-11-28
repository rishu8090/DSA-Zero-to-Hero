public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pen p1 = new Pen();         // creates a new object name p1;  
        p1.setcolour("yellow");
        System.out.println(p1.getcolour());

        p1.settip(5);
        System.out.println(p1.gettip());

        p1.setcolour("blue");
        System.out.println(p1.getcolour());

      Student s1 = new Student("Rishu"); // calling constructor .
      Student s2 = new Student();
      System.out.print(s1.name);
    }
}
     class Pen{
    String colour;
    int tip;

    String getcolour(){
        return this.colour;
    }
    int gettip(){
        return this.tip;
    }
     void setcolour(String newColour){
         this.colour =  newColour;
     }
     void settip(int newTip){
        this.tip = newTip;
     }
 }

 class Student{
    String name;
    int roll;
    Student(String name){   // this is  premeterised constructor;
        this.name = name;
    }
    Student(){ // this is a non premeterised constructor;

    }
 }
