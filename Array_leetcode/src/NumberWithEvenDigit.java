public class NumberWithEvenDigit {
    public static void main(String[] args) {
     int[] nums={123,345,212,6789};
     int ans =findNumbers(nums);
        System.out.println("Even digit numbers are ="+ans);
    }
    static int findNumbers(int[] nums){
        int even_num = 0;
        for(int num : nums){
            int count =0;
            while(num!=0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                even_num++;
            }
        }
        return even_num;
    }
}
