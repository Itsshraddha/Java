import java.util.*;
public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {2,4,7};
        int k= 181 ;
        System.out.println(addIntegerArrayForm(num,k));
    }
    static List<Integer> addIntegerArrayForm(int[] num ,int k){
    List<Integer> result = new ArrayList<>();
    int i = num.length-1;
    while(i>=0 && k>0){
        if(i>=0){
            k+=num[i];
            result.add(k%10);
            k=k/10;
            i-- ;
        }
    }
    return result.reversed();
    }
}

