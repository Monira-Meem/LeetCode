package arrays.easy;

public class _2367_Number_Of_Arithmetic_Triplets {

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {

                    if (Math.abs(nums[j] - nums[i]) == diff && Math.abs(nums[k] - nums[j]) == diff) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,8,9};
        int diff = 2;

        System.out.println(arithmeticTriplets(nums,diff));

    }
}
