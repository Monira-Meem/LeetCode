package arrays.easy;

public class ArrayMaxSumTest {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        int[] nums = {1,2,3,4,5,6,7,33,3,34};
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] nums = {11,3,4,5,32,5,23,4,0,70,0};
//        int[] nums = {1,1,1,1,1,1,1,1,1};
        int k = 3;

        int sum = 0;
        int max =Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
           if (i < k){
              sum += nums[i];
           } else {
               sum = sum + (nums[i] - nums[i -k]);
           }
           if (max < sum){
               max = sum;
           }
        }
        System.out.println(max);
    }
}
