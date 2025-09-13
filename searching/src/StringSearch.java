//import static com.sun.jndi.toolkit.dir.DirSearch.search;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Shraddha";
        System.out.println(Arrays.toString(name.toCharArray()));
        char target = 'y';
        boolean ans = search(name, target);
        System.out.println(ans);
    }
    static boolean search(String name,char target){
        for(char ch : name.toCharArray()){ //using for each loop //using > str_name.toCharArray() < method
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
