package strings.easy;

import java.util.Arrays;

public class CountConsistentString {

    public static void main(String[] args) {

        String[] words = {"ad","bd","aaab","baa","badab"};
        String allowed = "ab";
        int count = 0;

        boolean isChar = false;

        boolean[] b = new boolean[words.length];

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            isChar = false;

            for (char a :allowed.toCharArray()){
                for (char w : word.toCharArray()){
                    if (a == w  ){
                        isChar = true;
                    } else {
                        isChar = false;
                    }
                }
            }
            b[i] = isChar;
        }

        System.out.println(Arrays.toString(b));
    }
}
