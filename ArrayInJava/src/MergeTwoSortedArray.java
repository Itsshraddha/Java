import java.util.Arrays;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5,8};
        int[] arr2 = {2, 4, 6, 9};
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


    }
