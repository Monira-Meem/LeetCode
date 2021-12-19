package arrays.easy;

public class SingleNum_136 {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
//        int[] frequences = new int[nums.length/2+1];
//
        int num = 0;
//
//
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[i] == nums[j]){
//                    nums[i] = 0;
//                    nums[j] = 0;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));

        for (int j : nums) {
            num ^= j;
        }
        System.out.println(num);
    }
}
