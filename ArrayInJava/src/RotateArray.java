import java.util.*;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num={1,2,3,4,5,6,7};
        System.out.println("Original array = "+ Arrays.toString(num));
        System.out.println("Enter the value of k = ");
        int k = sc.nextInt();
        rotate(num,k);

    }
    static void reverse(int[] num,int start,int end){
        while(start<end){
            int temp = num[start];
            num[start]=num[end];
            num[end]=temp;

            start++;
            end--;
        }
    }
    static void rotate(int[] num,int k){
        int n=num.length;
        k = k%n; //handles when k>array length

        reverse(num ,0,n-1);
        reverse(num,0,k-1);
        reverse(num, k,n-1);
        System.out.println("Rotated array= "+Arrays.toString(num));
    }
}
// first reverse the entire array (0 ,n-1)
// then reverse the k elements (0,k-1)
// then reverse the remaining elements(k,n-1)