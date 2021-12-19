package strings.medium;

import java.util.Stack;

public class ScoreOfParentheses_856 {

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack();
        int score = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(score);
                score = 0;
            }else{
                score = stack.pop() + Math.max(2*score,1);
            }
        }
        return score;
    }

    public static void main(String[] args) {

        String s = "()()()";
        int count = 0;

        Stack<Integer> list = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '('){
                list.push(0);
            } else {
                if (list.peek() == 0){
                    list.pop();
                    list.push(1);
                } else {
                    int n = 0;
                    while (list.peek() != 0){
                        n += list.pop();
                    }
                    list.pop();
                    list.push(2 * n);
                }
            }
            System.out.println(list);
        }

        while (!list.isEmpty()){
            count += list.pop();
        }
        System.out.println(count);
        System.out.println(scoreOfParentheses(s));
    }
}
