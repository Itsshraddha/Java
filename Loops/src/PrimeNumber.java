import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        if(n<=1){
            System.out.println(n+"Number less or equal to 1 is not prime");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(n + " is prime");
            }
            else{
                System.out.println(n + " is not prime");
            }

        }
    }
}
