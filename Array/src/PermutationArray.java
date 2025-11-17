import java.util.*;

public class PermutationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array - ");
        int n =sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter elements in array - ");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        int[] result = buildArray(num);
        System.out.println("Output" +Arrays.toString(result));

    }
    static int[] buildArray(int[] num){
        int[] ans = new int[num.length];
        for(int i =0 ;i<num.length;i++){
            ans[i] = num[num[i]];
        }
        return ans;
    }
}
