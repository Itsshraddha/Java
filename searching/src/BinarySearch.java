import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);

      int[] arr ={3,4,6,8,9,16,21,37,49,55};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enetr the target = ");
      int target = sc.nextInt();
      String ans = search(arr,target);
        System.out.println(ans);
    }
     static String search(int[]arr,int target){
        int start =0;
        int end =  arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if (target>arr[mid]){
                start = mid-1;
            }
            else if(target<arr[mid]){
                end =mid+1;
            }
            else{
                return "element found at the index " +mid ;
            }
        }
        return "not found";
     }
}
