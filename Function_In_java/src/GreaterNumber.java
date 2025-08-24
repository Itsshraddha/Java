import java.util.Scanner;

public class GreaterNumber {
   public static void greaterAmongTwo(int a,int b){
       if(a>b){
           System.out.println(a+" is greater than " +b);
       }
       else{
           System.out.println(b+ "is greater than" +a);
       }
   }

    public static void greatestAmongThree(int a ,int b ,int c){
       if((a>b)&&(a>c)){
           System.out.println(a+" is greatest among three");
       }
       else if(b>c){
           System.out.println(b+" is greatest among three");
       }
       else{
           System.out.println(c+" is greatest among three");
       }

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number = ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number = ");
        int c = sc.nextInt();
        System.out.println("Greater among two");
        greaterAmongTwo(a,b);
        System.out.println("Greatest among three");
         greatestAmongThree(a,b,c);
    }

}
