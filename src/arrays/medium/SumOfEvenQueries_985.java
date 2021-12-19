package arrays.medium;

import java.util.Arrays;

public class SumOfEvenQueries_985 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};

        int len = nums.length;
        int[] sums = new int[len];
        int sum = 0;

        for (int n : nums){
            if ( n % 2 == 0){
                sum += n;
            }
        }

        for (int i = 0; i < len; i++){
            int val = queries[i][0];
            int ind = queries[i][1];

            if (nums[ind] % 2 == 0){
                sum -= nums[ind];
            }
            nums[ind]+= val;
//            System.out.println(Arrays.toString(nums));
            if (nums[ind] % 2 == 0){
                sum += nums[ind];
            }
            sums[i] = sum;
        }

//        for (int i = 0; i < len; i++){
//            sum = 0;
//            int value = queries[i][0];
//            int index = queries[i][1];
//            nums[index]+= value;
//            for (int num : nums) {
//                if (num % 2 == 0)
//                    sum += num;
//            }
//            sums[i] = sum;
//        }

        System.out.println(Arrays.toString(sums));
    }
}
