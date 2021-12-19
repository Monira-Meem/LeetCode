package dynamicProgramming.easy;

public class TribunacciNumber_1137 {

    public static void main(String[] args) {

        int n = 25;

        int n1 = 0;
        int n2 = 0;
        int n3 = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++){
            sum = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = sum;
        }

        System.out.println(sum);

    }
}
