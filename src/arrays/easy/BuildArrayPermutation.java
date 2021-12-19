package arrays.easy;

import java.util.Arrays;

public class BuildArrayPermutation {

    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4};
        int[] nums1 = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(buildArray(nums1)));

    }

    public static int[] buildArray(int[] nums) {
        int[] newAr = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            newAr[i] = nums[nums[i]];
        }
       return newAr;
    }
}
