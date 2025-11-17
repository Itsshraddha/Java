import java.util.*;

public class MaximumWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows =");
        int n = sc.nextInt();
        System.out.println("Enter number of col=");
        int m = sc.nextInt();
     int [][] acc = new int[n][m];
        System.out.println("Enter number in array =");
     for(int i=0;i<acc.length;i++){
         for(int j=0;j<acc[i].length;j++){
             acc[i][j] = sc.nextInt();
         }
     }
        System.out.println("Maximum wealth = "+maxWealth(acc));

    }
    static int maxWealth(int[][] acc){
        int max_wealth = 0;
        for(int i=0;i<acc.length ;i++){
        int curr_wealth = 0;
        for(int j=0;j<acc[i].length;j++){
            curr_wealth+= acc[i][j];
        }
        if(curr_wealth>max_wealth){
            max_wealth = curr_wealth;
        }
        }
        return max_wealth;
    }
}
