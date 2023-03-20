package strings.medium;

import java.util.Stack;

public class _1209_Remove_All_Adjacent_Duplicates_String_2 {

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

    public String removeDuplicates(String s, int k) {

        Stack<Character> stack = new Stack<>();
        Stack<Integer> countChar = new Stack<>();
        int temp = k;

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                countChar.push(countChar.peek()+1);
            } else {
                countChar.push(1);
            }

            stack.push(c);

            if (!countChar.isEmpty() && countChar.peek() == k) {
                while (temp > 0) {
                    stack.pop();
                    countChar.pop();
                    temp--;
                }
                temp = k;
            }
        }
        while (!stack.isEmpty()) {
            ss.append(stack.pop());
        }
        return ss.reverse().toString();
    }

    public static void main(String[] args) {

        String s = "pbbcggttciiippooaais";
        int k = 2;

        Stack<Character> stack = new Stack<>();
        Stack<Integer> countChar = new Stack<>();
        int temp = k;

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                countChar.push(countChar.peek()+1);
            } else {
                countChar.push(1);
            }

            stack.push(c);

            if (!countChar.isEmpty() && countChar.peek() == k) {
                while (temp > 0) {
                    stack.pop();
                    countChar.pop();
                    temp--;
                }
                temp = k;
            }
        }
        while (!stack.isEmpty()) {
            ss.append(stack.pop());
        }

        System.out.println(ss.reverse().toString());

    }
}
