import java.util.Scanner;

public class MultiplyTwoNumber {

    public static int multiplyTwoNumber(int a,int b){
        int multi = a*b;
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st num = ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd num = ");
        int b = sc.nextInt();
        System.out.println("Multiplication = " +multiplyTwoNumber(a,b));
    }
}
