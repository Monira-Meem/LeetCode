package arrays.easy;

import java.util.Arrays;

public class _645_Set_Mismatch {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,3,6};

        int[] ans = new int[2];

        int length = nums.length;
        int i = 0;

        while (i < length) {
            int expectedIndex = nums[i] -1;

            if (expectedIndex < length && nums[expectedIndex] != nums[i]) {
                int temp = nums[expectedIndex];
                nums[expectedIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < length; j++) {
            if (nums[j] != j + 1) {
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
