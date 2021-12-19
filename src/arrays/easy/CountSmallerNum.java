package arrays.easy;

import java.util.Arrays;

public class CountSmallerNum {

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};

        int[] temp = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            count = 0;
            for (int j = 0; j < nums.length; j++){

                if (nums[j] < nums[i]){
                    count++;
                }
            }
            temp[i] = count;
        }
        System.out.println(Arrays.toString(temp));
    }
}
