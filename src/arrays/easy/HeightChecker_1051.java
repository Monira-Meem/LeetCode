package arrays.easy;

import java.util.Arrays;

public class HeightChecker_1051 {

    public static void main(String[] args) {

        int[] heights = {5,1,2,3,4};

        int[] expected = new int[heights.length];
        int j = 0;
        for (int n : heights){
            expected[j] = n;
            j++;
        }
        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++){
            if (heights[i] != expected[i])
                count++;
        }
        System.out.println(count);
    }
}
