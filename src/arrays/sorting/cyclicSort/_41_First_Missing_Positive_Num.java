package arrays.sorting.cyclicSort;

public class _41_First_Missing_Positive_Num {

    static void sortArray(int[] nums) {

        int i = 0;
        int length = nums.length;

        while ( i < length) {

            int expectedIndex = nums[i] - 1;

            if (expectedIndex >= 0 && expectedIndex < length && nums[expectedIndex] != nums[i]) {
                int temp = nums[expectedIndex];
                nums[expectedIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
    }

    public static int firstMissingPositive(int[] nums) {

        sortArray(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i+1 )
                return i +1;

        }

        return nums.length+1;
    }


    public static void main(String[] args) {

        int[] nums = {3,4,-1,1};

        System.out.println(firstMissingPositive(nums));

    }

}
