import java.util.Scanner;

public class HollowRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hallow rectangle
        System.out.println("Enter the no. of row=  ");
        int n = sc.nextInt();
        System.out.println("Enter the no. of column=  ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
