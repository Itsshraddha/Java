import java.util.Scanner;
public class ThreeWell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input levels for three wells
        System.out.println("Enter the water level of well A = ");
        double a = sc.nextDouble();
        System.out.println("Enter the water level of well B = ");
        double b = sc.nextDouble();
        System.out.println("Enter the water level of well C = ");
        double c = sc.nextDouble();

        double total = a+b+c;
        double equal_Water_level = total/3;

        System.out.println("The equal water level for all three well A , B,C is = " +equal_Water_level);
    }
}
