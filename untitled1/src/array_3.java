import java.util.*;
public class array_3 {
    public static
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[5];
        System.out.println("Enter the element of array = ");
        for(int i =0;i<5;i++){
            number[i]= sc.nextInt();
        }
        System.out.println("Enter the element to be found = ");
        int x = sc.nextInt();

        for(int i = 0;i<5;i++){
            if(number[i]==x){
                System.out.println("element found at index = " +i);
            }
        }
    }
}
