import java.util.List;
import java.util.*;
public class SprialMatrix {
public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};
    System.out.println(sprialMat(matrix));
}

    static List<Integer> sprialMat(int[][] matrix){
        List<Integer> result= new ArrayList<>();
     int rows = matrix.length;
     int col = matrix[0].length;

     int top =0;
     int bottom=rows-1;
     int left = 0;
     int right = col-1;

     while (top<=bottom && left<=right){
         // travese top row from left to right
         for(int i = left;i<=right;i++){
             result.add(matrix[top][i]);
         }
         top++;
         // traverse last col from top to bottom
         for(int j= top; j<=bottom;j++){
             result.add(matrix[j][right]);
         }
         right--;
         //traverse last row from right to left
         if(top<=bottom) {
             for (int k = right; k >= left; k--) {
                 result.add(matrix[bottom][k]);
             }
             bottom--;
         }
         // traverse first col from bottom to top
         if(left<=right){
             for(int c =bottom; c>=top ;c--){
                 result.add(matrix[c][left]);
             }
             left++;
         }
     }
     return result;
    }
}
