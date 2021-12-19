package arrays.easy;

import java.util.Arrays;

public class SortArrayParity_905 {

    public static void main(String[] args) {

        int[] nums = {0};
        int[] ans = new int[nums.length];

        int j = nums.length-1;
        int i = 0;

        for (int num : nums){
            if (num % 2 == 0){
                ans[i] = num;
                i++;
            } else {
                ans[j] = num;
                j--;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
