package arrays.sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442_Find_All_Duplicate {

    static void sortedArray(int[] numbers) {
        int length = numbers.length;
        int i = 0;

        while (i < length) {

            int expectedIndex = numbers[i] -1;

            if (numbers[i] != numbers[expectedIndex]) {

                int temp = numbers[expectedIndex];
                numbers[expectedIndex] = numbers[i];
                numbers[i] = temp;
            } else {
                i++;
            }
        }
    }


    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        sortedArray(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i+1)
                list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));


    }

}
