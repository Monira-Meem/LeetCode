package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumMatrix_1380 {

    public static void main(String[] args) {

        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};// [[1,10,4,2],[9,3,8,7],[15,16,17,12]]

        List<Integer> list = new ArrayList<>();
        List<Integer> rowMins = new ArrayList<>();
        List<Integer> colMaxs = new ArrayList<>();

        for (int[] nums : matrix) {
            int rowMin = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num < rowMin) {
                    rowMin = num;
                }
            }
            rowMins.add(rowMin);
        }

        for (int i = 0; i < matrix[0].length; i++){
            int colMax = Integer.MIN_VALUE;
            for (int[] nums : matrix) {
                if (nums[i] > colMax) {
                    colMax = nums[i];
                }
            }
            colMaxs.add(colMax);
        }

        System.out.println(rowMins);
        System.out.println(colMaxs);

        for (Integer rowMin : rowMins) {
            for (Integer colMax : colMaxs) {
                if (rowMin.equals(colMax)) {
                    list.add(rowMin);
                }
            }
        }
        System.out.println(list);

    }
}
