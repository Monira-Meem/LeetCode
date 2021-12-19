package strings.easy;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Vowel_345 {

    public static boolean isVowel(char c){

        if (c=='a' || c== 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            return true;

        return false;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        StringBuilder rev = new StringBuilder();

        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()){
            if (isVowel(c)){
                list.add(c);
            }
        }

        System.out.println(list);

        int j = list.size()-1;

        for (char c : s.toCharArray()){

            if (isVowel(c)){
                c = list.get(j);
                j--;
            }

            rev.append(c);
        }
        System.out.println(rev);
    }
}
