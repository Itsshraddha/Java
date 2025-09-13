import java.util.Scanner;

public class saerchIn2DArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[][] arr= {
                {45,5,9,11},
                {96,32,8},
                {4,25,67,3,92}
        };
        /*for(int row = 0; row<arr.length;row++){
            for(int col = 0 ;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
                }
            System.out.println();
            }*/
      /*  System.out.println("Enter target = ");
        int target = sc.nextInt();*/
        //int ans = search(arr);
        System.out.println(Max(arr));
        }

        static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row:arr){  // using enhanced for loop for returning the value of maximum number
            for(int col: row){
                if(col>max){
                   max=col;
                   // return max;
                }
            }
        }
            return max;
    }
}
