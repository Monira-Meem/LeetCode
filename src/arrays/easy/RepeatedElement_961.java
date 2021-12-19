package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElement_961 {

    public static int repeatedNTimes(int[] nums) {
        int ans = 0;
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
        int n = nums.length/2;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == n){
                ans = entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,3};
        int ans = 0;
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

        int n = nums.length/2;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == n){
                ans = entry.getKey();
            }
        }
        System.out.println(ans);
    }
}
