package arrays.easy;

public class MakingArrIncreasing_1827 {

    public static int minOperations(int[] nums) {
        if (nums.length == 1)
            return 0;

        int temp = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            temp++;
            if (nums[i] < nums[i-1]){
//                while (nums[i] < nums[i-1]){
//                    nums[i]++;
//                    count++;
//                }
//                nums[i]++;
//                count++;

                count += (temp -nums[i]);
            } else if (nums[i] > temp){
                temp = nums[i];
            }
        }
        return count;
    }

    public static int countOperations(int[] nums){

        if (nums.length == 1)
            return 0;
        int count = 0;
        int diff = 0;

        for (int i = 1; i< nums.length; i++){
            if (nums[i] < nums[i-1]){
                diff = 1 + (nums[i-1] - nums[i]);
                nums[i] += diff;
            }
            count += diff;
        }
        return count;
    }

    public static void main(String[] args) {

///        int[] nums = {1,5,2,4,1};
//        int[] nums ={1,1,1};
        int[] nums = {4881,2593,6819,9256,4135};

        int count = 0;
        int diff = 0;

        for (int i = 1; i< nums.length; i++){
            if (nums[i] <= nums[i-1]){
                diff = 1 + (nums[i-1] - nums[i]);
                nums[i] += diff;
                count += diff;
            }
        }

        System.out.println(count);

//        System.out.println(minOperations(nums));
//        System.out.println(minOperations(nums1));
//        System.out.println(minOperations(nums2));
//
//        System.out.println(countOperations(nums));
//        System.out.println(countOperations(nums1));
//        System.out.println(countOperations(nums2));


//        int count = 0;
//
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] <= nums[i-1]){
//                while (nums[i] < nums[i-1]){
//                    nums[i]++;
//                    count++;
//                }
//                nums[i]++;
//                count++;
//            }
//            System.out.println(Arrays.toString(nums));
//        }
//        System.out.println(count);

    }
}
