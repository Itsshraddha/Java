import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age = ");
        int age= sc.nextInt();
        if(age<18){
            System.out.println("not adult");
        }
        else{
            System.out.println("Is an adult");
        }
    }
}
