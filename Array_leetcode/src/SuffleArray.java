import java.util.*;

public class SuffleArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of n =");
        int n =sc.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter the element = ");
        for(int i =0; i< nums.length ;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println("Input array - "+ Arrays.toString(nums));
        System.out.println(Arrays.toString(suffle(nums,n)));
    }
    static int [] suffle(int[] nums ,int n){
        int ans[] =new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1] =nums[i+n];
        }
        return ans;
    }
}
