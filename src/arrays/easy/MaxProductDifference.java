package arrays.easy;

public class MaxProductDifference {
//    int n = nums.length;
//    int min = Integer.MAX_VALUE;
//    int secmin = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    int secmax = Integer.MIN_VALUE;
//        for(int i = 0; i < n; i++) {
//            //Checking for min and secmin
//        if(nums[i] < min) {              //item smaller than min, hence both min and secmin gets updated
//            secmin = min;
//            min = nums[i];
//        }
//        else if(nums[i] < secmin) {     //item greater than min but item smaller than secmin
//            secmin = nums[i];
//        }
//        //Checking for max and secmax
//        if(nums[i] > max) {             //item greater than max, hence both max and secmax gets updated
//            secmax = max;
//            max = nums[i];
//        }
//        else if(nums[i] > secmax) {     //item smaller than max but item greater than secmax
//            secmax = nums[i];
//        }
//    }
//        return max * secmax - min * secmin;

    public static int maxDiff(int[] nums){
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int secondMin =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin) {
                secondMin = num;
            }

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return (max * secondMax)-(min * secondMin);
    }

    public static void main(String[] args) {

        int[] nums = {5,6,2,7,4};
        int[] nums2 = {4,2,5,9,7,4,8};


        System.out.println(maxDiff(nums));
        System.out.println(maxDiff(nums2));

    }
}
