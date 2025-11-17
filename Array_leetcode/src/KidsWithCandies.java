import java.util.*;
public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies =1;
        System.out.println(kidsWithCandies(candies ,extraCandies));

    }
    static List<Boolean> kidsWithCandies (int[] candies , int extraCandies){
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandies = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]> maxCandies){
                maxCandies = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >=maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
     return result;
    }
}
