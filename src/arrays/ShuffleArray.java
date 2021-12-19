package arrays;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int j = 0;
        int k = 1; ;

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length/2;i++ ){
            temp[j] = nums[i];
            j+=2;
        }

        for (int i = n; i < nums.length; i++){
            temp[k] = nums[i];
            k+=2;
        }

        System.out.println(Arrays.toString(temp));
    }
}
