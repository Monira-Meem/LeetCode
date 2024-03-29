package arrays.easy;

import java.util.Arrays;

public class _628_Max_Product_Three_Numbers {

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int productStart = nums[0] * nums[1] * nums[n-1];
        int productEnd = nums[n-1] * nums[n-2] * nums[n-3];

        return Math.max(productStart,productEnd);
    }

    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

}
