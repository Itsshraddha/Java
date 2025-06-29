import java.util.Scanner;
//Floyd's triangle
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {                      // 1
            for (int j = 1; j <= i; j++) {                  // 2 3
                System.out.print(num + " ");                // 4 5 6
                num++;                                      // 7 8 9 10
            }                                               // 11 12 13 14 15
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {                      // 1 2 3 4
            for (int j = 1; j <= n - i; j++) {              // 5 6 7
                System.out.print(num + " ");                // 8 9
                num++;                                     //  10
            }
            System.out.println();
        }
    }
}