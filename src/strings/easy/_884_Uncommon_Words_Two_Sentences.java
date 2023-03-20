package strings.easy;

import java.util.*;

public class _884_Uncommon_Words_Two_Sentences {

    public static void main(String[] args) {

        String s1 = "apple apple";
        String s2 = "banana";

        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (String s : s1.split(" "))
            map.put(s,map.getOrDefault(s,0)+1);

        for (String s : s2.split(" ")) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        String[] ans = new String[list.size()];

        int i = 0;
        for (String s : list) {
            ans[i] = s;
            i++;
        }


        System.out.println(list);


    }
}