import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows you want  = ");
        int r = sc.nextInt();
        System.out.println("how many cols you want  = ");
        int c =sc.nextInt();
        int[][] matarr =new int[r][c];
        System.out.println("Enter the "+ (r*c) +" numbers in matrix = ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c; j++){
                matarr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c; j++){
                System.out.print(matarr[i][j] +" ");
            }
            System.out.println();
        }
        //transpose of matrix
        System.out.println("Transpose of matrix = ");
        for(int i=0; i<c ; i++){
            for(int j=0;j<r;j++) {
                System.out.print(matarr[j][i] + " ");
            }
                System.out.println();
        }
    }
}
