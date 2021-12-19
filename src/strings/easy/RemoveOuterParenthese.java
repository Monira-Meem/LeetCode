package strings.easy;

import java.util.Stack;

public class RemoveOuterParenthese {

    public static void main(String[] args) {

        String s = "(()())(())(()(()))";

        String newString = "";

        Stack<Character> list = new Stack<>();

        for (int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if (c == '('){
                if (list.size() >= 1){
                    newString += c;
                }
                list.push(c);

            } else if (c == ')'){
                if (list.size() > 1){
                    newString += c;
                }
                list.pop();
            }
        }
        System.out.println(newString);
    }
}
