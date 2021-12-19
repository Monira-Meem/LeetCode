package arrays.easy;

public class ArrayMaximumSum {

    public static int maxSum(int[] nums, int k){
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length -k +1; i++){
            int j = i;
            int temp = k;
            while (temp != 0){
                sum += nums[j];
                j++;
                temp--;
            }

            if (max == 0){
                max = sum;
            } else if (max < sum){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5,6,7,33,3,34};
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        int[] nums = {11,3,4,5,32,5,23,4,0,70,0};
//        int[] nums = {1,1,1,1,1,1,1,1,1};
        int[] nums = {1};
        int k = 2;

        System.out.println(maxSum(nums,k));
    }
}
