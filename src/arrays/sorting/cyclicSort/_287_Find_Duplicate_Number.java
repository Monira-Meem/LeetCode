package arrays.sorting.cyclicSort;

import java.util.Arrays;

public class _287_Find_Duplicate_Number {

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

    public static void main(String[] args) {

        int[] numbers = {1,3,4,2,4};
        sortedArray(numbers);

        System.out.println(Arrays.toString(numbers));

    }

}
