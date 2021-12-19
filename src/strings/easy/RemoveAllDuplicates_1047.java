package strings.easy;

import java.util.Stack;

public class RemoveAllDuplicates_1047 {

    public static String removeDuplicates(String s) {

        String ss = "";

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
            ss = stack.peek() + ss;
            stack.pop();
        }

        return ss;
    }

    public static void main(String[] args) {

//        String ss = "";
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//
//            if (stack.isEmpty() || stack.peek() != c){
//                stack.push(c);
//            } else {
//                stack.pop();
//            }
//        }
//
//        while (stack.size() > 0){
//            ss += stack.peek();
//            stack.pop();
//        }

        System.out.println(removeDuplicates("azxxzy"));
        System.out.println(removeDuplicates("abbaca"));

    }
}
