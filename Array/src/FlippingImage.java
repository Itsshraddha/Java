import java.util.Arrays;
import java.util.Scanner;

public class FlippingImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] image = {{1,1,0,0},
                         {1,0,0,1},
                         {0,1,1,1},
                         {1,0,1,0}};

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    static int[][] flipAndInvertImage(int[][] image){
        for(int[] row : image){
            int start =0 , end = row.length-1;
            while(start<=end){
                int temp = row[start]^1;
                row[start] = row[end]^1;
                row[end]= temp;
                start++;
                end--;
            }

        }
        return image ;
    }
}
