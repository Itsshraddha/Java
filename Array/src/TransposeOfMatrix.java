import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {-2,-10,11}};
        int[][] transpose = transpose(mat);
        System.out.println(" Transpose matrix = ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
    static int[][] transpose(int[][] mat){
        int m = mat.length;
        int n= mat[0].length;
        int[][] result = new int[n][m];
        for(int i=0 ; i<m;i++){
            for(int j=0 ;j<n;j++) {
                result[j][i] = mat[i][j];
            }
        }
        return result ;
    }
}
