package arrays.countingSort;

import java.util.Arrays;

public class Array_Partition_561 {

    public static void main(String[] args) {

        int[] nums = {1,4,3,2};

        Arrays.sort(nums);
        int sum = 0;

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
