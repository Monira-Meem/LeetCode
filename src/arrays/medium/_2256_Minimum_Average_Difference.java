package arrays.medium;

public class _2256_Minimum_Average_Difference {

    public int minimumAverageDifference(int[] nums) {

        if (nums.length==1){
            return 0;
        }

        long[] temp = new long[nums.length];

        long min = Integer.MAX_VALUE;
        int index = -1;
        long total = 0;

        for (int num : nums) {
            total += num;
        }

        long sum = 0;

        for (int i =  0;i < nums.length-1; i++) {

            sum += nums[i];

            temp[i] = Math.abs((sum/(i+1)) - ((total-sum)/(nums.length-i-1)));

            if ( temp[i] < min ){
                min = temp[i];
                index = i;
            }
        }

        temp[nums.length-1] = total/nums.length;

        if (temp[nums.length-1] < min){

            min = temp[nums.length-1];
            index = nums.length-1;

        }
        return index;
    }
}
