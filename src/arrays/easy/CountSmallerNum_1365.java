package arrays.easy;

import java.util.Arrays;

public class CountSmallerNum_1365 {

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};

        int l = nums.length;
        int[] ans = new int[l];

        for (int i = 0; i < l; i++){
            int count = 0;
            for (int n : nums){
                if (nums[i] > n)
                    count++;
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));

    }
}
