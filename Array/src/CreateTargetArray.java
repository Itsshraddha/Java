import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
    int[] nums = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i< nums.length;i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
