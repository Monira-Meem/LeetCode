package practice;

import java.util.Arrays;

public class CountConsistentStringTest {

    public static void main(String[] args) {

        String[] words = {"ad","bd","aaab","baa","badab"};
        Arrays.sort(words);

        String allowed = "ab";

        int count = 0;

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++){
            String w = words[i];

            System.out.println(Arrays.toString(w.toCharArray()));
        }



    }
}
