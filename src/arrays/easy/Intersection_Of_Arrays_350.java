package arrays.easy;

import java.util.*;

public class Intersection_Of_Arrays_350 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int n : nums1){
            if (map.containsKey(n) ){
                int count = map.get(n);
                count++;
                map.put(n,count);
            } else {
                map.put(n,1);
            }
        }

        for (int n : nums2){
            if (map.containsKey(n) && map.get(n) != 0){
                list.add(n);
                int count = map.get(n);
                count--;
                map.put(n,count);
            }
        }

        int i = 0;
        int[] ans = new int[list.size()];
        for (int n : list){
            ans[i] = n;
            i++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
