public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={2,5,7,16,28};
        int target = 16;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){ // .length is a variable in arr.length // but in string .length() is a method
            return 0;
        }
        for(int ele : arr){
            if(target==ele){
                return ele;
            }
        }
        return -1;
    }
}
