package arrays.easy;

import java.util.*;

public class _2032_Two_Out_Of_Three {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Map<Integer,Integer> map3 = new HashMap<>();


        int[] freq = new int[100];

        for (int n : nums1) {
            map1.put(n, map1.getOrDefault(n,0)+1);
        }
        for (int n : nums2) {
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        for (int n : nums3) {
            map3.put(n,map3.getOrDefault(n,0)+1);
        }

        for (int n : map1.keySet()) {
            freq[n-1]++;
        }
        for (int n : map2.keySet()) {
            freq[n-1]++;
        }
        for (int n : map3.keySet()) {
            freq[n-1]++;
        }

        for (int i = 0; i < freq.length; i++) {
            int n = freq[i];
            if (n > 1) {
                list.add(i+1);
            }
        }

        System.out.println(list);
    }
}
