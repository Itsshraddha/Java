import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number =");
        int n = sc.nextInt();
        if ((n % 2 == 0) && (n % 3 == 0) && (n % 5== 0)) {
            System.out.println("Number is divisible by 2 , 3 and 5");
        } else if((n%2==0)&&(n%3==0)&&(n%5!=0)){
            System.out.println("only dividible by 2 and 3");
        }
        else if((n%2==0)&&(n%3!=0)&&(n%5==0)) {
            System.out.println("only dividible by 2 and 5");
        }
        else if((n%2!=0)&&(n%3==0)&&(n%5==0)){
                System.out.println("only dividible by 3 and 5 ");
        }
        else if (n % 2 == 0) {
            System.out.println("number is divisible by 2");
        } else if (n % 3 == 0) {
            System.out.println("number is divisible by 3");
        } else if (n % 5 == 0) {
            System.out.println("number is divisible by 5");
        }
        else{
                System.out.println("Not divisible by anyone");
            }
        }
}