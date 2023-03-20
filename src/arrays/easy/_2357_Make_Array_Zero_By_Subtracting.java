package arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class _2357_Make_Array_Zero_By_Subtracting {

    public static int minimumOperations(int[] nums) {


//        int count = 0;
//        while (!isAllZero(nums)) {
//            count++;
//            int min = findMin(nums);
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == 0) continue;
//                nums[i] = nums[i] - min;
//            }
//        }
//        return count;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num != 0) {
                set.add(num);
            }
        }

        return set.size();
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i == 0) continue;
            min = Integer.min(min, i);
        }
        return min;
    }

    private static boolean isAllZero(int[] arr) {
        for (int i : arr) {
            if (i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));

    }

}
