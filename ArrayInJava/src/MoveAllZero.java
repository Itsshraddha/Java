import java.util.*;

public class MoveAllZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array= ");
        int n =sc.nextInt();
         int[] a = new int[n];
        System.out.println("Enter the elements of array = ");
        for(int i=0;i<n ;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array= ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        moveZero(a);
    }
    static void moveZero(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        System.out.println("Zero Moved at the end  "+ Arrays.toString(a));
    }
}
