package arrays.easy;

public class _2006_Count_NumOfPairs_With_Absolute_Difference {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,4};
        int k = 2;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i < j && Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
