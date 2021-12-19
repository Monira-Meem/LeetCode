package strings.easy;

public class FindDifference_389 {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        int[] chars = new int[256];

        for (int i = 0; i < t.length(); i++ ){
            char c = t.charAt(i);
            chars[c]++;
        }

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            chars[c]--;
        }
        int j = 0;
        for (j = 0; j < chars.length; j++){
            if (chars[j] != 0)
                break;
        }
        System.out.println((char) j);
    }
}
