package strings.easy;

import java.util.Stack;

public class _1047_Remove_All_Adjacent_Duplicates_In_String {

    public static String removeDuplicates(String s) {

        StringBuilder ss = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        while (stack.size() > 0){
            ss.append(stack.peek());
            stack.pop();
        }

        return ss.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));

    }
}
