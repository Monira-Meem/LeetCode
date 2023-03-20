package arrays.easy;

public class _2057_Smallest_Index_With_Equal_Value {

    public static int smallestEqual(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int num = i % 10;
            if (num == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,1};
        System.out.println(smallestEqual(nums));

    }
}
