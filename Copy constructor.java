public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Student s1 = new Student();
         s1.name = "rishu";
         s1.roll = 202;
         s1.password ="abcd";
         s1.marks[0] = 100;
         s1.marks[1] = 90;
         s1.marks[2] = 55;

         Student s2 = new Student(s1); ///here we copy properties of s1 to s2.
        s2.password = "xyz";
        s1.marks[1] =99;
        for(int i =0; i < 3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
     class Student{
        String name;
        int roll;
        String password;
        int marks[];

        // Shallow copy constructor - used to copy properties of s1 to s2.
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks =s1.marks;
        //  }
 
        // deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i =0; i <3; i++){
                this.marks[i] = s1.marks[i]; 
            }
        }

        Student(){
            marks = new int[3];
            System.out.println("constructure is called");
        }
        Student(String name){
            marks = new int[3];
            this.name = name;
        }
        Student(int roll){
            marks = new int[3];
            this.roll = roll;
        }
     }
