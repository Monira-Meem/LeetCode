package binarySearch.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Array_349 {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

//        int l1 = nums1.length;
//        int l2 = nums2.length;
//
//        int i = 0;
//        int j = 0;

        Set<Integer> list = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();

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

//        while (l1 > 0 && l2 > 0){
//            if (nums1[i] == nums2[j])
//                list.add(nums1[i]);
//
//            i++;
//            j++;
//            l1--;
//            l2--;
//        }

        System.out.println(list);
        System.out.println(Arrays.toString(ans));
    }
}
