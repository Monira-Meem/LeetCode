package strings.easy;

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");

        if (ss.length != pattern.length())
            return false;

        HashMap<String, Character> map = new HashMap<>();
        int index = 0;

        for (String s1 : ss){

            if (map.containsKey(s1) && map.get(s1) != pattern.charAt(index)){
                return false;
            }

            if (!map.containsKey(s1)){
                if (map.containsValue(pattern.charAt(index)))
                    return false;
                map.put(s1,pattern.charAt(index));
            }
            index++;
        }

        return true;
    }

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern,s));

    }
}
