package arrays.easy;

import java.util.Arrays;

public class Sort_Colors_75 {

    public static int[] sortColors(int[] nums) {
        int i = 0, count0 = 0, count1 = 0;

        for (i = 0; i < nums.length; i++){
            if (nums[i] == 0)
                count0++;
            if (nums[i] == 1)
                count1++;
        }

        for (i = 0; i < count0; i++){
            nums[i] = 0;
        }

        for (i = count0; i < count0+count1; i++){
            nums[i] = 1;
        }

        for (i = count0+count1; i < nums.length; i++){
            nums[i] = 2;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));

    }
}
