import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str ="aabbbccccdddaff";
     System.out.print(strCompression(str));     
    }
    
    public static String strCompression(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++ ){
            Integer count = 1;
            while( i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr +=count.toString();
            }
        }
        return newStr;
    }
    }

 
