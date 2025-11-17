import java.util.*;
public class MatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer","silver","phone"));
        items.add(List.of("phone","gold","iphone"));

        String ruleKey = "type";
        String ruleVale = "phone";

        int result = countMatches(items,ruleKey,ruleVale);
        System.out.println(result);



    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        int index =0;
        if(ruleKey.equals("type"))
        {
            index=0;
        }
        else if(ruleKey.equals("color"))
        {
            index =1;
        } else if (ruleKey.equals("name"))
        {
            index=2;
        }

        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
