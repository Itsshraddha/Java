import java.util.Scanner;

public class SumOfnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
    int n = sc.nextInt();
    int sum =0;
    for(int i=1;i<=n;i++){
        sum = sum +i;
    }
        System.out.println("Sum of n number is "+sum);
    }
}
