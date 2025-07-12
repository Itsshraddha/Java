import java.util.*;
public class Reverseofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        int og=n;
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n/=10;
        }
        System.out.println("Reverse of the number is = ");
        System.out.println(rev);
        if(rev==og){
            System.out.println("yes number is palindrom");
        }
        else{
            System.out.println("No this is not a palindrom");
        }

    }
}
