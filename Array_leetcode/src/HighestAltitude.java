public class HighestAltitude {
    public static void main(String[] args) {
      int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain){
        int start_point = 0;
        int maxAltitude =0;
        for(int i=0 ;i<gain.length;i++){
            start_point+= gain[i];
            if(start_point > maxAltitude){
                maxAltitude=start_point;
            }
        }
     return maxAltitude;
    }
}
