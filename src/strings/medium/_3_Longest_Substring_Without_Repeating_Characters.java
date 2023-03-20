package strings.medium;

import java.util.HashMap;
import java.util.Map;

public class _3_Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;

        if (s.length() == 1)
            return 1;

        int startIndex = 0;
        int leftIndex = 0, rightIndex = 1;

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                startIndex = Math.max(startIndex,map.get(c)+1);
            }

            if (rightIndex - leftIndex < i+1 - startIndex) {
                leftIndex = startIndex;
                rightIndex = i+1;
            }
            map.put(c,i);
        }
        return Math.abs(rightIndex - leftIndex);
    }

    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }

}
