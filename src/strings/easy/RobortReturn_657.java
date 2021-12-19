package strings.easy;

public class RobortReturn_657 {

    public static boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;
        for (char c : moves.toCharArray()){
            if (c == 'U')
                ud++;
            else if (c == 'D')
                ud--;
            else if (c == 'L')
                lr ++;
            else if (c == 'R')
                lr--;
        }
        return lr == 0 && ud == 0;
    }

    public static void main(String[] args) {

        System.out.println(judgeCircle("RRDD"));
        System.out.println(judgeCircle("LDRRLRUULR"));
        System.out.println(judgeCircle("LDRRLRUULR"));
        System.out.println(judgeCircle("UD"));

    }
}
