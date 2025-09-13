import java.util.*;
public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        int[] num ={8,4,1,9,5,7};
        int[] arr1={2,4,6,8};
        int[] arr2={1,3,5};
        int[] a = {0,1,0,2,3,4};
        System.out.println("original array " + Arrays.toString(arr));
        reverse(arr);
        maxMin(arr);
        sumOfTwo(arr);
        secondLargest(num);
        mergeTwoArr(arr1,arr2);
        moveZero(a);
    }
    static void reverse(int[]arr){
        int n = 5;
        int start=0;
        int end =n-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++ ;
            end --;
        }
        System.out.println("REVERSE = " +Arrays.toString(arr));
    }


    static void maxMin(int[]arr) {
          int max = arr[0];
          int min = arr[0];
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] > max) {
                  max = arr[i];
              }
              if(arr[i]<min){
                  min = arr[i];
              }
          }
          System.out.println("Maximum number in the array is= " + max);
          System.out.println("Minimum number in the array is= " + min);
    }
    static void sumOfTwo(int[] arr){
        int target_sum= 7;
        System.out.println("Target sum= "+target_sum);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target_sum){
                    System.out.println("Numbers of array are = " +arr[i] +" And " +arr[j]);
                }
            }
        }
    }
    static void secondLargest(int[] num){
        // sorting array in ascending order
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("second last element = " +num[num.length-2]);
    }
    static void mergeTwoArr(int[]arr1,int[]arr2){
        int n= arr1.length;
        int m = arr2.length;
        int mergeArr[]= new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                mergeArr[k++]=arr1[i++];
            }
            else{
                mergeArr[k++]= arr2[j++];
            }
        }
        while(i<n){
            mergeArr[k++]=arr1[i++];
        }
        while(j<m){
            mergeArr[k++]=arr1[j++];
        }
        System.out.println("Merged array = ");
        // for(int element: mergeArr){
        System.out.println(Arrays.toString(mergeArr));
    }
    static void moveZero(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            //move all non zero element forword
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        System.out.println("Zero Moved at the end  "+ Arrays.toString(a));
    }
}

