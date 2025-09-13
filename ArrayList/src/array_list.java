// Array list are used to create for infinite capacity .
//  An arraylist have infinite capacity to store items .

import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(81);
        list.add(26);
        list.add(84);
        list.add(75);
        System.out.println(list);

     /*   for(int i=0;i<5;i++) {
            list.add(in.nextInt());
        }

        for(int i=0;i<5;i++) {
        System.out.println(list.get(i));
        }*/
    }
}