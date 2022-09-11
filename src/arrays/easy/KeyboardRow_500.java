package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow_500 {

    public static boolean isContains(String word, String row) {

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!row.contains(Character.toString(ch))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String[] words = {"adsdf","sfd"};

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (String word : words) {

            if (isContains(word,firstRow)) {
                list.add(word);
            }

            if (isContains(word,secondRow)) {
                list.add(word);
            }

            if (isContains(word,thirdRow)) {
                list.add(word);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

}
