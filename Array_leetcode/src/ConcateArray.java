import java.lang.reflect.Array;
import java.util.*;

public class ConcateArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the " +n+ " element in array = ");
        for (int i=0;i<n ;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println("Input" + Arrays.toString(nums));
        int[] result = getConcatenation(nums);
        System.out.println("Output" + Arrays.toString(result));
    }
    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n] ;
        for(int i=0;i<n ;i++){
            ans[i] = nums[i];
            ans[i+n] =nums[i];
        }
        return ans;
    }
}
