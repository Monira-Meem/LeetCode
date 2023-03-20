package strings.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _2423_Remove_Letter_To_Equalize_Frequency {

    public static void main(String[] args) {

        String word = "aabc";

        int count = 0;
        int[] frequencies = new int[26];

        for (char c : word.toCharArray()) {
            int charInd = c - 'a';
            frequencies[charInd]++;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

        int prev = 0;

        for (int freq : frequencies) {



        }


    }
}
