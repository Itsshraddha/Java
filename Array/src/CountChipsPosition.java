public class CountChipsPosition {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(chipsPosition(position));
    }
    static int chipsPosition(int[] positon){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i< positon.length ;i++){
            if(positon[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        int min = Math.min(evenCount,oddCount);
        return min;
    }
}
