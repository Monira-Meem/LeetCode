package strings.medium;

import java.util.Stack;

public class _227_Basic_Calculator {

    public static void main(String[] args) {

        String s = " 3/2 ";

        s = s.trim();
        int num = 0;
        char operator = '+';
        int total = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char presentChar = s.charAt(i);

            if (Character.isDigit(presentChar)) {
                num = num * 10 + (presentChar - '0');

            }
           // stack.push(num);

            if ( !Character.isDigit(presentChar) && presentChar != ' ' || i == s.length()-1) {

                if (operator == '+') {
                    stack.push(num);
                } else if (operator == '-') {
                    stack.push(-num);
                } else if (operator == '*') {
                    int mul = stack.pop() * num;
                    stack.push(mul);
                } else if (operator == '/') {
                    int div = stack.pop() / num;
                    stack.push(div);
                }
//                System.out.println(stack);
                num = 0;
                operator = presentChar;

            }
        }

        while ( !stack.isEmpty()) {
            total += stack.pop();
        }
        System.out.println(total);
    }

}
