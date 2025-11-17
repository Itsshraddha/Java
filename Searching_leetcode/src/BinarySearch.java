public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-15,2,4,6,7,11,19,21,25,28,30};
        int target = -15;
        System.out.println(binary(arr,target));
    }
    static boolean binary(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end =mid-1;
            }
            else if(target == arr[mid]){
                return true ;
            }
        }
        return false;
    }
}