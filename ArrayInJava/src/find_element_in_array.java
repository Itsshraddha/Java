import java.util.Scanner;

public class find_element_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        //input
        System.out.println("Enter the numbers of array = ");
        for(int i =0;i<numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter the element to be found = ");
        int x = sc.nextInt();
        //output
        for(int i =0;i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("Element found at the index = " +i);
            }
        }


    }
}
