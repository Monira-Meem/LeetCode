package strings.easy;

import java.util.HashSet;
import java.util.Set;

public class _2351_First_Letter_Appear_Twice {

    public static char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c))
                return c;
            set.add(c);
        }
        return ' ';
    }

    public static void main(String[] args) {

        String s = "abcdd";
        System.out.println(repeatedCharacter(s));

    }
}
