import java.util.*;

public class RunningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size = ");
        int n  =in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter "+n+ "element = ");
        for(int i=0;i<n;i++){
            nums[i]= in.nextInt();
        }
        System.out.println("Input  - "+Arrays.toString(nums));
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int n= nums.length;
        for(int i=1;i<n;i++){
            nums[i] =nums[i] + nums[i-1];
        }
        return nums ;
    }
}
