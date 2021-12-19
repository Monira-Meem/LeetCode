package strings.easy;

public class MaxNestingDepth {

    public static void main(String[] args) {

//        String s = "(1)+((2))+(((3)))";
//        String s = "1+(2*3)/(2-1)";
//        String s = "1";
        String s = "(1+(2*3)+((8)/4))+1";
        int count = 0;
        int max = 0;

        for (char c : s.toCharArray()){

            if (c == '(')
                count++;

            if (max < count)
                max = count;

            if (c == ')')
                count--;
        }
        System.out.println(max);
    }
}
