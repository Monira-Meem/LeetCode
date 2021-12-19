package dynamicProgramming.easy;

public class ClimbingStairs_70 {

    public static void main(String[] args) {


        int n = 45;

        int steps = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= n; i++){
            steps = n1 + n2;
            n1 = n2;
            n2 = steps;
        }
        System.out.println(steps);
    }
}
