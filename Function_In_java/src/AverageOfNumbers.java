public class AverageOfNumbers {

    public static double averageOfThreeNumbers(int a, int b, int c) {
        int sum = a+b+c;
        int avg =sum/3;
        return avg;
    }
    public static void main(String[] args) {
        int a= 5;
       int  b= 3;
        int c= 2;
        System.out.println("Average of three numbers is = " +averageOfThreeNumbers(a,b,c));


    }


}
