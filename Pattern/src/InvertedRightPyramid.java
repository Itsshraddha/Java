

public class InvertedRightPyramid {
    public static void main(String[] args) {
        int n = 5;
        //for row
        for(int i =n;i>=1;i--){
            //for spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }//for pattern
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}