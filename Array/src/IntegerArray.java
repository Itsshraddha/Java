import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
    int n =5 ;
    int[] ans = nIntegerArray(n);
    Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
    static int[] nIntegerArray(int n){
        int[] result = new int[n];
        int num=1;

        for(int i=0 ;i<n/2;i++){
            result[i] =num;
            result[i+(n/2)] =-num;
            num++;
        }
        if(n%2!=0){
            result[n-1]=0;

        }

        return result;
    }
}
