import java.util.Scanner;

public class SpAndCp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost price = ");
    double cp= sc.nextDouble();
        System.out.println("Enter the selling price = ");
        double sp= sc.nextDouble();

        if(sp>cp){
            double profit = sp-cp;
            System.out.println("You made a profit of = "+profit);
            double per_profit= (profit/cp)*100;
            double round = Math.round(per_profit*100);
            System.out.println("profit in percentage % = "+round/100);
        }
        else if(cp>sp){
            double loss = sp-cp;
            System.out.println("You incurred a loss = "+loss);
            double per_loss= (loss/cp)*100;
            double round = Math.round(per_loss*100);
            System.out.println("Loss in percentage %= "+round/100);
        }
    }
}
