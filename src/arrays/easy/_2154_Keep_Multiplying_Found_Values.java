package arrays.easy;

import java.util.Arrays;

public class _2154_Keep_Multiplying_Found_Values {

    public static int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);

//        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {

                if (num == original)
                    original *= 2;

            }
 //       }

        return original;
    }

    public static void main(String[] args) {


//        [8,19,4,2,15,3]
//        2

        int[] nums = {8,19,4,2,15,3};
        System.out.println(findFinalValue(nums,2));
    }

}
