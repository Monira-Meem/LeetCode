package arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1002_Find_Common_Characters {

    public static void main(String[] args) {

        String[] words = {"cool","lock","cook"};

        Map<String, Integer> map = new HashMap<>();

        for (char ch : words[0].toCharArray()) {
            map.put(ch+"",map.getOrDefault(ch+"",0)+1);
        }

        for (int i = 1; i < words.length; i++) {

            Map<String, Integer> temp = new HashMap<>();

            String word = words[i];

            for (char ch : word.toCharArray()) {
                String s = ch+"";

                if (map.containsKey(s)) {
                    int min = Math.min(map.get(s),temp.getOrDefault(s,0)+1);
                    temp.put(s, min);
                }
            }
            map = temp;

        }
        System.out.println(map);

        List<String> list = new ArrayList<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);

    }

}
