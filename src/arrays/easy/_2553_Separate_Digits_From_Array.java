package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2553_Separate_Digits_From_Array {

    public static int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        List<Integer> temp;

        for (int num : nums) {

            temp = new ArrayList<>();

            while (num != 0) {
                int n = num % 10;
                temp.add(n);
                num /= 10;
            }

            Collections.reverse(temp);
            list.addAll(temp);
            temp = null;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));

    }
}
