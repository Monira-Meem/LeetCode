package strings.easy;

public class MergeString_1768 {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder s = new StringBuilder();

        int i = 0;
        while (i != word1.length() && i != word2.length()){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            i++;
        }

        if (i == word1.length()){
            s.append(word1.substring(i));
        } else {
            s.append(word2.substring(i));
        }

        return s.toString();
    }
}
