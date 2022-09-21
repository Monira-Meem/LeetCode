package arrays.sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_Find_All_Disappeared_Number {

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

    static List<Integer> findAllDisappearedNumber(int[] nums) {

        sortedArray(nums);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i+1 != nums[i]) {
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] numbers = {12,12,4,3,2,7,8,3,3,2,1,1};

        System.out.println(findAllDisappearedNumber(numbers));
    }

}
