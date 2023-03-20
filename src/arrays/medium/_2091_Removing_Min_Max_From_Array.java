package arrays.medium;

public class _2091_Removing_Min_Max_From_Array {

    public static int minimumDeletions(int[] nums) {

        int length = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIn = 0;
        int minIn = 0;
        int maxCount;
        int minCount;

        if (length == 1)
            return 1;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n >= max) {
                max = n;
                maxIn = i;
            }
            if (n <= min) {
                min = n;
                minIn = i;
            }
        }

        if (maxIn > minIn) {
            maxCount = Math.min( maxIn + 1, Math.abs(length-minIn));
            minCount = (minIn + 1) +Math.abs(length - maxIn);
        } else {
            minCount = Math.min( minIn + 1, Math.abs(length - maxIn));
            maxCount = (maxIn + 1) + Math.abs(length - minIn);
        }

        return Math.min(maxCount,minCount);
    }


    public static void main(String[] args) {

        int[] nums = {0,-4,19,1,8,-2,-3,5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIn = 0;
        int minIn = 0;
        int maxCount;
        int minCount;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n >= max) {
                max = n;
                maxIn = i;
            }
            if (n <= min) {
                min = n;
                minIn = i;
            }
        }

        int length = nums.length;

        maxCount = Math.min( maxIn+1, Math.abs(length - maxIn));
        minCount = Math.min( minIn+1, Math.abs(length-minIn));

        int total = maxCount + minCount;

        System.out.println(minimumDeletions(nums));

    }
}
