import java.util.*;
public class New {
    public static void main(String[] args) {
            String input = "ab@cd#ef";
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Check if current char is special character
                if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                    i++; // skip next character too
                } else {
                    result.append(ch);
                }
            }

            System.out.println("Cleaned String: " + result.toString());
        }
}

