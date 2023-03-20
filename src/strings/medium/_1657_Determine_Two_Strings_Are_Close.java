package strings.medium;

import java.util.Arrays;

public class _1657_Determine_Two_Strings_Are_Close {

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())
            return false;

        int[] frequences1 = new int[26];
        int[] frequences2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {

            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            frequences1[c1 - 'a']++;
            frequences2[c2 - 'a']++;

        }

        for (int i = 0; i < frequences1.length; i++) {

            if (frequences1[i] == 0 && frequences2[i] != 0) {
                return false;
            }

            if (frequences1[i] != 0 && frequences2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(frequences1);
        Arrays.sort(frequences2);

        for (int i = 0; i < frequences2.length; i++) {
            if (frequences1[i] != frequences2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(closeStrings("abc","bca"));
        System.out.println(closeStrings("a","aa"));
        System.out.println(closeStrings("cabbba","abbccc"));

    }
}
