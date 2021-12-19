package arrays.easy;

import java.util.Arrays;

public class ConcatArray_1929 {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i = 0; i < nums.length; i++){
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,1};
//        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
}
