package strings.easy;

import java.util.Stack;

public class _1544_Make_The_String_Great {

    public static void main(String[] args) {

        String s =  "abBAcC";

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char pres = s.charAt(i);
          //  char next = sb.charAt(i+1);

            if (stack.isEmpty()) {
                stack.push(pres);
            } else {
                char prev = stack.peek();

                if (Math.abs(prev - pres) == 32) {
                    stack.pop();
                } else {
                    stack.push(pres);
                }
            }
//            if (pres == (char) (next + 32)) {
//                sb.delete(i,i+2);
//            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse().toString());

    }
}
