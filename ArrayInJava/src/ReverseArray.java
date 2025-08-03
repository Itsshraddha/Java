import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the size of size of array = ");
        int n = sc.nextInt();
        int [] num=new int[n];
        System.out.println("Enter the elements in array = ");
        for(int i =0;i<n;i++){
            num[i]= sc.nextInt();
        }
        int start= 0,end=n-1;
        while(start<end){
            //swaping of number
            int temp = num[start];
            num[start]= num[end];
            num[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed ARRAY = ");
        for(int i =0 ;i<n;i++){
            System.out.println(num[i] + " ");
        }
    }
}
