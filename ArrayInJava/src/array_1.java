import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();

        //String [] name = new String[size];
        int [] marks = new int [size];
        System.out.println("Enter the marks of student = ");
        //System.out.println("Enter the name = ");
        //input
        for(int i = 0;i<size ; i++){
            marks[i]=sc.nextInt();
          //   name[i] = sc.nextLine();
        }
        //output
       // for(int i = 0;i<size ;i++){
         //   System.out.println(marks[i]+" ");
          //  System.out.println(name[i]);
        //}
        System.out.println(Arrays.toString(marks));

       //int []arr = {2,4,6,8,10,12,14,16,18,20};
        //for(int element: arr){
          //  System.out.println(element);
        //}
    }
}