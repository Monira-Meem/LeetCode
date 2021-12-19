package arrays.easy;

import java.util.Arrays;

public class Two_Sum2_167 {

    public static int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length-1;
        while (l < r){
            int sum = numbers[l] + numbers[r];
            if (sum == target){
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            } else if (sum < target){
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] numbers = {-1,0};
        int target = -1;

        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
}
