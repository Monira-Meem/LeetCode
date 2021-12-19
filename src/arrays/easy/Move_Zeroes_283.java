package arrays.easy;

import java.util.Arrays;

public class Move_Zeroes_283 {

    public static void main(String[] args) {

        int[] nums = {0,1};

        int j = 0;
        int count = 0;
        int length = nums.length;

        for (int n : nums){
            if (n == 0){
                count++;
            } else {
                nums[j] = n;
                j++;
            }
        }
        System.out.println(j);

        for (int i = j; i < length; i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
