package slidingwindow;

public class _209_Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;

        int i = 0;
        int j = 0;
        int min = nums.length +1;

        while (j < nums.length) {

            target -= nums[j];
            j++;
            while (target <= 0) {
                min = Math.min(min,j - i);
                target += nums[i];
                i++;
            }

        }
        System.out.println(min % (nums.length+1));
    }
}
