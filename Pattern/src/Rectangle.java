import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //rectangle
        System.out.println("Enter the no. of row=  ");
        int n = sc.nextInt();
        System.out.println("Enter the no. of column=  ");
        int m = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
