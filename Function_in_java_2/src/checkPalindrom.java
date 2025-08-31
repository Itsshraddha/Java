import java.util.Scanner;

public class checkPalindrom {
    public static String palindrom(int n) {
        int rev= 0;
        int og =n;
        while(n>0){
            int d = n%10;
            rev= rev*10+d;
            n/=10;
        }
        if(rev==og)
            return "Number is palindrom";
        else
            return "Number is not a palindrom";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        System.out.println(palindrom(n));

    }
}
