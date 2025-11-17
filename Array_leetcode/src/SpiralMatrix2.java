import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
         int[][] ans = sprialMat2(n);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] sprialMat2(int n){
        int [][] matrix = new int[n][n];
        int num=1;
        int top = 0 , bottom = n-1 , left =0 ,right=n-1;

        while( top<=bottom && left<=right){
            for(int i =left ;i<=right;i++){
                matrix[top][i]=num;
                num++;
            }
            top++;

            for(int j=top;j<=bottom;j++){
                matrix[j][right]=num;
                num++;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num;
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    matrix[j][left]=num;
                    num++;
                }
                left++;
            }
        }
        return matrix;
    }
}
