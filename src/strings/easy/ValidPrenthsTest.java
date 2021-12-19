package strings.easy;

import java.util.Stack;

public class ValidPrenthsTest {

    public static void main(String[] args) {

        System.out.println(isValid("(]"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s){
        Stack<Character> list = new Stack<>();

        for (char c : s.toCharArray()){

            if (list.isEmpty() && (c == ')' || c == '}' || c == ']'))
                return false;

            if (c == '(' || c == '{' || c == '[')
                list.push(c);
            else {
                if (c == ')' && list.peek() == '(')
                    list.pop();
                else if (c == '}' && list.peek() == '{')
                    list.pop();
                else if (c == ']' && list.peek() == '[')
                    list.pop();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
