public class FindMin {
    public static void main(String[] args) {
        int[] arr={11,7,2,-43,98};
        System.out.println(minElement(arr));
    }
    static int minElement(int[] arr){
        int min = arr[0];
        for(int i=1;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
