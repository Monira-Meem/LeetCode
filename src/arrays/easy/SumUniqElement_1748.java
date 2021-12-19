package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SumUniqElement_1748 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,2};
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int n : nums){
            if (map.containsKey(n)){
                int count = map.get(n);
                count++;
                map.put(n,count);
            } else {
                map.put(n,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
