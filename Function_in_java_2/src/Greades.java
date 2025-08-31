import java.util.Scanner;

public class Greades {
    public static String grades(int marks) {
        if(marks>=90&&marks<=100)
        return "Grade AA";
        else if(marks>=80&&marks<=90)
        return "Grade AB";
        else if(marks>=70&&marks<=80)
            return "Grade BB";
        else if(marks>=60&&marks<=70)
            return "Grade BC";
        else if(marks>=50&&marks<=60)
            return "Grade CD";
        else if(marks>=40&&marks<=50)
            return "Grade DD";
        else
            return "Fail";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the grade out of 100 = ");
        int marks = sc.nextInt();
        System.out.println( grades(marks));

    }
}
