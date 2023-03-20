package arrays.medium;

import java.util.*;

public class _532_KDiff_Pairs_Array {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int k = 0;

        int count = 0;

        Map<Integer, Integer> map = new HashMap();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int i : map.keySet()){
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1) {
                count++;
            }
        }
        System.out.println(count);

    }
}
