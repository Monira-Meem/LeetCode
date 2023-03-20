package arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2085_Count_Common_Words_With_One_Occurrence {

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : words1) {
            map1.put(s,map1.getOrDefault(s,0)+1);
        }

        for (String s : words2) {
            map2.put(s,map2.getOrDefault(s,0)+1);
        }

        return 0;
    }

    public static void main(String[] args) {

        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};

        int count = 0;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        List<String> list = new ArrayList<>();

        for (String s : words1) {
            map1.put(s,map1.getOrDefault(s,0)+1);
        }

        for (String s : words2) {

            if (map1.containsKey(s)) {
                if (map1.get(s) < 2) {
                    list.add(s);
                } else {
                    list.remove(s);
                }
                map1.put(s,map1.getOrDefault(s,0)+1);
            }
        }

        System.out.println(list);
        System.out.println(list.size());
    }

}
