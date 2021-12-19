package arrays.easy;

import java.util.*;

public class IntersectionArray2_350 {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        List<Integer> list = new ArrayList<>();
        List<Integer> numSet = new ArrayList<>();

        for (int n : nums1){
            numSet.add(n);
        }

        for (int n : nums2){
            if (numSet.contains(n)){
                list.add(n);
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
