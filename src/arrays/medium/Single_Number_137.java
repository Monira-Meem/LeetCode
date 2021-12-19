package arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class Single_Number_137 {

    public static void main(String[] args) {

        int[] nums = {0,1,0,1,0,1,99};

        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            if (map.containsKey(n)){
                map.put(n, map.get(n)+1);
            } else {
                map.put(n,1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                ans = entry.getKey();
        }

        System.out.println(ans);

    }

}
