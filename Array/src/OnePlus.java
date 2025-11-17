import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnePlus {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] ans = addOneInArray(digits);
        System.out.println(Arrays.toString(ans));
    }
    static int[] addOneInArray(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {

            if (digits[i] < 9) {
                int k = digits[digits.length] + 1;
                digits[digits.length] = k;
            }
        }
        return digits;

    }
}
