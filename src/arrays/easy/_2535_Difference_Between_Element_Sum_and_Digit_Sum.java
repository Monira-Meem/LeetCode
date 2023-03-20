package arrays.easy;

public class _2535_Difference_Between_Element_Sum_and_Digit_Sum {

    public static int differenceOfSum(int[] nums) {

        int total = 0;
        int digitSum = 0;

        for (int num : nums) {
            total+=num;

            while (num != 0) {
                int mod = num % 10;
                digitSum += mod;
                num /= 10;
            }
        }

        return Math.abs(total-digitSum);
    }

    public static void main(String[] args) {

        int[] nums = {1,15,6,3};

        System.out.println(differenceOfSum(nums));
    }

}
