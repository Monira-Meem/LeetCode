package arrays.easy;

import java.util.Arrays;

public class RunningSum {

    public int[] solution(int[] nums){
        int sum = 0;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            temp[i] = sum;
        }
        return temp;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int sum = 0;
        int[] t = new int[a.length];

        for (int i = 0; i < a.length; i++){
            sum += a[i];
            t[i] = sum;
        }

        System.out.println(Arrays.toString(t));
    }
}
