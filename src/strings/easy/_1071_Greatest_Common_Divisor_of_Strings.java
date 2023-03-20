package strings.easy;

public class _1071_Greatest_Common_Divisor_of_Strings {

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {


        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("LEET","ABC"));

    }
}
