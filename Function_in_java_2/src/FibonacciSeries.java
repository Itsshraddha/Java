import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonnaciSeries(int n) {
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+ " ");
            int temp = a+b;
            a=b;
            b=temp;
        }
        return ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("The fibonacci series = " );
        fibonnaciSeries(n);
    }
}
