package arrays.easy;

import java.util.Arrays;

public class SquaresSortedArray_977 {

    public static int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];

        for (int i = 0; i < squares.length; i++){
            int n = nums[i];
            int sqrs = n * n;
            squares[i] = sqrs;
        }
        Arrays.sort(squares);
        return squares;
    }

    public static void main(String[] args) {

        int[] nums = { 11, 33,-4,-1,0,3,10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
