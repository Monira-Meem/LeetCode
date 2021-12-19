package arrays.easy;

import java.util.Arrays;

public class CreateTargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++){
            target[i] = -1;
        }
        for (int i = 0; i < nums.length; i++){
            if (target[index[i]] == -1){
                target[index[i]] = nums[i];
            } else {
                for (int j = target.length-1; j> index[i]; j--){
                    target[j] = target[j-1];
                }
                target[index[i]] = nums[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] nums1 = {1,2,3,4,0};
        int[] index1 = {0,1,2,3,0};
        int[] nums2 = {1};
        int[] index2 = {0};



        System.out.println(Arrays.toString(createTargetArray(nums,index)));
        System.out.println(Arrays.toString(createTargetArray(nums1,index1)));
        System.out.println(Arrays.toString(createTargetArray(nums2,index2)));
    }
}
