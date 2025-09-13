import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    static int linear(int[] arr,int x){
       for(int i=0;i<arr.length;i++){ // return the index value of the element
       // for(int i: arr){ // for getting the element which is we searching
           if (arr[i]== x) {
              System.out.println("Element found at the index ="+i);
              //return i;
           }

       }
            //System.out.println("Element is not found");
       return -1; //-1 tells that element does not exist bcz negative index is not possible
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {3,5,7,8,11,9,32,47,29,19};
        System.out.println("Original array = " + Arrays.toString(arr));
        System.out.println("Enter the number to be found = ");
        int x = sc.nextInt();
       // int n = arr.length;
        linear(arr,x);
//System.out.println(ans);
    }
}
