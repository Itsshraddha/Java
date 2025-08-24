import java.util.Scanner;

public class First_function_program {
    public static int add_Two_Number(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number = ");
        int b= sc.nextInt();
        System.out.println("Sum of the number is "+add_Two_Number(a,b));
    }
}
