package arrays.hard;

import java.util.Arrays;

public class Median_Two_Sorted_Array_4 {

    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        int[] mergedArr = new int[l1+ l2];

        while (n1 < l1 && n2 < l2){
            if (nums1[n1] <= nums2[n2]){
                mergedArr[i] = nums1[n1];
                n1++;
            } else {
                mergedArr[i] = nums2[n2];
                n2++;
            }
            i++;
        }

        while (n1 < l1){
            mergedArr[i] = nums1[n1];
            n1++;
            i++;
        }
        while (n2 < l2){
            mergedArr[i] = nums2[n2];
            n2++;
            i++;
        }
       return mergedArr;
    }
    public static double mid(int[] nums){
        double median = 0;
        int mid = nums.length/2;
        double num = nums[mid];

        if (nums.length % 2 == 0){
            median =  (num + nums[mid -1])/2;
        } else {
            median = num;
        }
        return median;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(Arrays.toString(findMedianSortedArrays(nums1,nums2)));
        System.out.println(mid(findMedianSortedArrays(nums1,nums2)));

    }
}
