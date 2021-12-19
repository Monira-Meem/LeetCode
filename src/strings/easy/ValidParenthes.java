package strings.easy;

import java.util.Stack;

public class ValidParenthes {

    public static boolean isValid(String s) {

        Stack<Character> list = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '['){
                list.push(c);
            }
            else if (!list.isEmpty()){
                if (c == ')' && list.peek() == '('){
                    list.pop();
                } else if (c == '{' && list.peek() == '}')
                    list.pop();
                else
                    return false;
            }
            else if (!list.isEmpty() && (c == ')' || c == '}' || c == ']'))
                return false;
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
    }
}
