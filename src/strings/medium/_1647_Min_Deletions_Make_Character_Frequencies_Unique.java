package strings.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1647_Min_Deletions_Make_Character_Frequencies_Unique {

    public static int minDeletions(String s) {
        int count = 0;
        int[] frequencies = new int[26];

        for (char c : s.toCharArray()) {
            int charInd = c - 'a';
            frequencies[charInd]++;

        }

        System.out.println(Arrays.toString(frequencies));

        Set<Integer> set = new HashSet<>();

        for (int freq : frequencies ) {
            while (freq != 0 && set.contains(freq)){
                freq--;
                count++;
            }
            set.add(freq);
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "aab";

        int count = 0;
        int[] frequencies = new int[26];

        for (char c : s.toCharArray()) {
            int charInd = c - 'a';
            frequencies[charInd]++;

        }

        System.out.println(Arrays.toString(frequencies));

        Set<Integer> set = new HashSet<>();

        for (int freq : frequencies ) {

            while (freq != 0 && set.contains(freq)){
                freq--;
                count++;
            }
            set.add(freq);

        }

        System.out.println(set);

        System.out.println(count);

    }
}
