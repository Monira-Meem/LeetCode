package arrays.easy;

public class ShuffleString_1528 {

    public static String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            c[indices[i]] = s.charAt(i);
        }
        String s1 = String.valueOf(c);
        return s1;
    }

    public static void main(String[] args) {

    }
}
