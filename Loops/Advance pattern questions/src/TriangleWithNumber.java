import java.util.Scanner;

public class TriangleWithNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row = ");
      int n = sc.nextInt();
        //           1
        //           2 2
        //           3 3 3
        //           4 4 4 4
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(i+" ");
           }
           System.out.println();
       }
         //           1
         //           1 2
         //           1 2 3
         //           1 2 3 4
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}