package arrays.medium;

import java.util.Arrays;

public class Container_With_Most_Water_11 {

    public static void main(String[] args) {


        int[] height = {1,8,6,2,5,4,8,3,7};

//        [0, 1, 8, 8, 8, 8, 8, 8, 8]
//        [8, 8, 8, 8, 8, 8, 7, 7, 0]

        int leftMax = 0;
        int rightMax = 0;

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            left[i] = leftMax;
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }

        for (int i = height.length -1; i >= 0; i--) {
            right[i] = rightMax;
            if (rightMax < height[i]) {
                rightMax = height[i];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int total = 0;

        for (int i = 0; i < height.length; i++) {

            int min = Math.max(left[i],right[i]);
            int hei = height[i];

            if (min < hei) {
                total += hei - min;
            }
        }

        System.out.println(total);

    }
}
