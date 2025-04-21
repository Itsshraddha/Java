import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number = ");
        double b = sc.nextDouble();
        System.out.println("For\n Addition - 1\n subraction - 2\n mutiplication - 3\n division - 4");
        System.out.println("Enter the number for operation = ");
        int n = sc.nextInt();
        switch(n){
            case 1 : System.out.println(a+b);
            break ;
            case 2 : System.out.println(a-b);
                break ;
            case 3: System.out.println(a*b);
                break ;
            case 4 : System.out.println(a/b);
                break ;
            default:
                System.out.println("Invailad operation");
        }
    }
}
