import java.util.Scanner;

public class solution {
    public static void eligibleForVote(int age) {
        if(age>=18){
            System.out.println("Eligible for vote ");
        }
        else{
            System.out.println("Not eligible for vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age of person = ");
        int age = sc.nextInt();
        eligibleForVote(age);

    }
}
