package arrays.easy;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int x = nums.length-k;
        int y = 0;
        int[] rotated = new int[nums.length];

        for (int i = 0; i < k; i++){
            rotated[i] = nums[x];
            x++;
        }

        for (int i = k; i < nums.length; i++ ){
            rotated[i] = nums[y];
            y++;
        }
        System.out.println(Arrays.toString(rotated));
    }
}
