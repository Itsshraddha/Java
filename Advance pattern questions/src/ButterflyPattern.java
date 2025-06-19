

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 6;
        //upper half
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int s = 2 * (n - i);  //spaces
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //lower half
            for (int i = n; i >= 1; i--) {
                //stars
                for (int j = 1; j <= i; j++) {
                        System.out.print("*");


                }
                int s = 2 * (n - i); //spaces
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }