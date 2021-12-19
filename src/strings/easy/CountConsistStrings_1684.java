package strings.easy;

import java.util.HashSet;
import java.util.Set;

public class CountConsistStrings_1684 {

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words= {"ad","bd","aaab","baa","badab"};

        int count = 0;

        Set<Character> set = new HashSet<>();

        for (char c : allowed.toCharArray()){
            set.add(c);
        }

        for (String word : words){
            boolean found = true;
            for (char c : word.toCharArray()){
                if (!set.contains(c)){
                    found = false;
                }
            }
            if (found)
                count++;
        }

        System.out.println(count);
    }
}
