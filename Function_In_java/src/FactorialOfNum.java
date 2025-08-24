import java.util.Scanner;

public class FactorialOfNum {
    public static void printFactorial(int n) {
        if(n<=0){
            System.out.println("Invailed input");
        return;
        }
        int fac = 1;
        for(int i = 1; i<=n;i++){
            fac = fac*i;
        }
        System.out.println(fac);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        printFactorial(n);
    }

}
