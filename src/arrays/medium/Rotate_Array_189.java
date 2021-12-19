package arrays.medium;

import java.util.Arrays;

public class Rotate_Array_189 {

    public static int[] rotate(int[] nums, int k){
        int[] temp = new int[k];
        int x = 0;
        for (int i = nums.length-k; i < nums.length; i++){
            temp[x] = nums[i];
            x++;
        }
        int j = k;
        for (int i = 0; i < nums.length-k; i++){
            nums[j] = nums[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++){
            nums[i] = temp[i];
        }
        return nums;
    }

    public void rotateReverse(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
//        int[] rotated = new int[nums.length];
//
//        int x= 0;
//
//        for (int i = nums.length-k; i < nums.length; i++){
//            rotated[x] = nums[i];
//            x++;
//        }
//
//        for (int i = 0; i < nums.length-k; i++){
//            rotated[x] = nums[i];
//            x++;
//        }

        System.out.println(Arrays.toString(rotate(nums,k)));
    }
}
