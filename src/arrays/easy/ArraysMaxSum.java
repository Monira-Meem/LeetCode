package arrays.easy;

import java.util.Arrays;

public class ArraysMaxSum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 9;
        int temp = k;

        int[] temps = new int[nums.length];

        int max = 0;
        int num = 0;
        int sum = 0;

        for (int i = 0; i < nums.length-k+1; i++){
           int j = i;
           temp = k;
           while (temp != 0){
               sum += nums[j];
               j++;
               temp--;
           }
           temps[i] = sum;
           sum = 0;
        }

        for (int i = 0; i < temps.length; i++){
            int n = temps[i];

            if (max == 0){
                max = n;
            }
            if (max < n){
                max = n;
            }
        }

        System.out.println(Arrays.toString(temps));
        System.out.println(max);
    }
}
