package strings.medium;

import java.util.Arrays;

public class MakingAnagram {

    public static void main(String[] args) {

//        String s ="bab";
//        String t ="aba";
//        String s = "leetcode";
//        String t = "practice";
        String s = "anagram";
        String t = "mangaar";
        int count = 0;

        int[] sCount = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char ts = t.charAt(i);
            int sIn = ss - 'a';
            int tIn = ts - 'a';

            sCount[sIn]++;
            sCount[tIn]--;
        }

        for (int i = 0; i < 26; i++){
            if (sCount[i] >=1){
                count += sCount[i];
            }
        }
        System.out.println(Arrays.toString(sCount));
        System.out.println(count);
    }
}
