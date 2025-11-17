public class OrderAgnosticBinarySeach {
    public static void main(String[] args) {

        int[] arr = {90,88,75,61,52,44,30,14,11,8,5,2,1};
        int target = 5;
        int ans= orderAgnostic(arr,target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        boolean is_Asc = arr[s] < arr[e];  // condition check ascending or descending
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (is_Asc) {          // ascending order
                if (target < arr[mid]) {
                    e = mid - 1;
                } else if (target > arr[mid]) {
                    s = mid + 1;
                }
            }
            else {                       // descending order
                if (target < arr[mid]) {
                    s = mid + 1;
                } else if (target > arr[mid]) {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
