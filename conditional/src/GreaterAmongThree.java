import java.util.Scanner;

public class GreaterAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number c  = ");
        int a = sc.nextInt();
        System.out.println("Enter the second number b = ");
        int b = sc.nextInt();
        System.out.println("Enter the third number c = ");
        int c = sc.nextInt();
    if ((a>b)&&(a>c)){
        System.out.println("a is greater ");
    }
    else if(b>c) {
        System.out.println("b is greater");
    }
    else{
        System.out.println("c is greater");
    }
    }
}
