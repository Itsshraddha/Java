import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number = ");
        double n = sc.nextDouble();
        double fac=1;
        for(int i=1;i<=n;i++) {
            fac = fac * i;
        }
        System.out.println("factorial of number ");
        System.out.println(fac);

    }
}
