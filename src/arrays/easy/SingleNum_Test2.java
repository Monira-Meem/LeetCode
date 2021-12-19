package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNum_Test2 {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        int ans = 0;

        HashMap<Integer,Integer> list = new HashMap<>();

        for (int num : nums) {

            if (!list.containsKey(num)) {
                list.put(num, 1);
            } else {
                list.put(num, list.get(num + 1));
            }
        }

        for (Map.Entry<Integer,Integer> entry : list.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1)
                ans = key;
        }

        System.out.println(ans);
    }
}
