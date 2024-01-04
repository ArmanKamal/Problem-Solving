package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character poppedCharacter = stack.pop();
                if (poppedCharacter == '(' && c != ')'
                        || poppedCharacter == '{' && c != '}'
                        || poppedCharacter == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
