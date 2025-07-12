import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        int original_num=n;
        int sum=0;
        while(n>0){
            int d= n%10;
            sum+=d*d*d;
            n/=10;
         }
        if(sum==original_num){
            System.out.println("Yes this is an armstrng number ");
        }
        else {
            System.out.println("No this is not an armstrong number");
        }
    }
}
