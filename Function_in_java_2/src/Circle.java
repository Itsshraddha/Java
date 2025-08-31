import java.util.Scanner;

public class Circle {
    //function for area of circle
    public static double areaOfCircle(double r) {
        double area = 3.14*r*r;
       return area ;
    }
    //function for circumference of circle
    public static double circumOfCircle(double r) {
        double cir = 2*3.14*r;
        return cir ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of circle = ");
        double r = sc.nextDouble();
        System.out.println("The circumference of circle = " +circumOfCircle(r));
        System.out.println("The area of circle = " +areaOfCircle(r));

    }
}
