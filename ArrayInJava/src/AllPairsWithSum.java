import java.util.Arrays;
import java.util.Scanner;
public class AllPairsWithSum { //find pairs in array whose sum is equal to target
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {3,4,1,5,7,2,6,9,7,8};
        System.out.println("the given array = ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target = ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }




    }
}
