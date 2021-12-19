package strings.easy;

public class ChessboardColor_1812 {

    public static boolean squareIsWhite(String coordinates) {
        int sum = coordinates.charAt(0) + coordinates.charAt(1);
        return sum % 2 == 1;
    }

    public static void main(String[] args) {

        String s = "c7";
        int s0 = s.charAt(0);
        int s1 = s.charAt(1);
        int sum = s0 + s1;

        if (sum % 2 == 1){
            System.out.println("Black");
        }else {
            System.out.println("White");
        }
        System.out.println(sum);
        System.out.println(s0);
        System.out.println(s1);

        System.out.println(squareIsWhite(s));

    }
}
