import java.util.Scanner;

public class MaxAndMininArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at the index" + i + "=");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("Maximum element is = " +max);
            System.out.println("Minimum element is = " +min);

    }
}