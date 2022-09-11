package strings.medium;

public class MultiplyString_43 {

    public static String multiply(String num1, String num2) {

        String ans = "";

        long num1s = Long.parseLong(num1);
        long num2s = Long.parseLong(num2);

        long multiply = num1s * num2s;

        return String.valueOf(multiply);
    }

    public static void main(String[] args) {

        System.out.println(multiply("2","5"));
        System.out.println(multiply("123","456"));

    }
}
