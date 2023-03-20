package strings.easy;

public class _2309_Greatest_English_Letter_Upper_Lower_Case {

    public static String greatestLetter(String s) {

        if (s.length() == 1)
            return "";

        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                lowerCase[index]++;
            } else {
                int index = c - 'A';
                upperCase[index]++;
            }
        }
        int letter = 0;

        for (int i = 25; i >= 0; i--) {

            if (lowerCase[i] > 0 && upperCase[i] > 0) {
                if (i == 0)
                    return "A";
                else
                    letter = i;
                break;
            }
        }

        if (letter == 0)
            return "";

        char ans = (char) ('A' + letter);
        return Character.toString(ans);
    }

    public static String greatestLetterAnother(String s) {

        for (char c = 'Z'; c >= 'A'; c--) {
            if (s.indexOf(c) != -1 && s.indexOf(c+32) != -1)
                return c+"";
        }
        return "";
    }

    public static void main(String[] args) {

        String s = "AAAAAAAAaa";

       System.out.println(greatestLetter(s));
       System.out.println(greatestLetterAnother(s));


    }
}
