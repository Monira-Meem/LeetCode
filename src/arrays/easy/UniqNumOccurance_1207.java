package arrays.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqNumOccurance_1207 {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int n : arr){
            if (map.containsKey(n)){
                int count = map.get(n);
                count++;
                map.put(n,count);
            } else {
                map.put(n,1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int counted = entry.getValue();
            set.add(counted);
        }

        return set.size() == map.size();
    }
}
