package arrays.easy;

import java.util.Arrays;

public class SumUniElement {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,2};
        int[] nums = {1,1,1,1,1};

        int[] temps = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length-1; i++){

            if (nums[i] == nums[i+1]){
                nums[i] = 0;
                nums[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
