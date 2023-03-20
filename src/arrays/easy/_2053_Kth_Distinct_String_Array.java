package arrays.easy;

import java.util.*;

public class _2053_Kth_Distinct_String_Array {

    public static String kthDistinct(String[] arr, int k) {

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }

        if (list.size() < k)
            return "";

        return list.get(k-1);

    }

    public static void main(String[] args) {

       String[] arr = {"a","b","a"};
       int k = 3;

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        int count = 0;
        String ans = "";

        for (String s : arr) {
            if (map.get(s) == 1) {
                count++;
                if (count == k)
                    ans = s;
            }
        }
        System.out.println(ans);
        System.out.println(kthDistinct(arr,3));

    }
}
