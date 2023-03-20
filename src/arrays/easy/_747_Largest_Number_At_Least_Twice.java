package arrays.easy;

import java.util.Arrays;

public class _747_Largest_Number_At_Least_Twice {

    public static int dominantIndex(int[] nums) {

        int largestNum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > largestNum) {
                largestNum = num;
                index = i;
            }
        }

        for (int num : nums) {
            if ((num * 2) > largestNum && num != largestNum)
                return -1;

        }

        return index;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(dominantIndex(nums));

    }

}
