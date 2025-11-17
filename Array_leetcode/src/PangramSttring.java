public class PangramSttring {
    public static void main(String[] args) {
    String sentence = "thequickbrownfoxjumpsove";
        System.out.println(pangramString(sentence));
    }
    static boolean pangramString(String sentence){
        sentence = sentence.toLowerCase();
        boolean[] seen = new boolean[26];
         for(int c : sentence.toCharArray()){
             if(c>='a' && c<='z'){
                 seen[c -'a'] = true;
             }
         }
          for(boolean b : seen){
              if(!b) return false;
          }
          return true;
    }
}
