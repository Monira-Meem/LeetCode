package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_205 {

    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if (map.containsKey(ss)){
                if (tt != map.get(ss)){
                    return false;
                }
            }
            else if (map.containsValue(tt)){
                if (!map.containsKey(ss))
                    return false;
            }
            else {
                map.put(ss,tt);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
        System.out.println(isIsomorphic("badc","baba"));
    }
}
