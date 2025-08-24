
import java.util.Scanner;

public class PrintStringThroughFunction {
     public static void printMyString(String name){
         System.out.println(name);
         return;
     }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string = ");
        String name = sc.nextLine();
       printMyString(name);
    }
}
