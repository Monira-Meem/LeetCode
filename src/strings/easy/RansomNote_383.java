package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()){
            if (map.containsKey(c)){
                int count = map.get(c);
                count++;
                map.put(c,count);
            } else {
                map.put(c,1);
            }
        }

        for (char c : ransomNote.toCharArray()){
            if (map.containsKey(c)){
                int count = map.get(c);
                count--;

                if (count >= 0){
                    map.put(c,count);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));

    }
}
