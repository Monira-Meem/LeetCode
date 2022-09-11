package arrays.easy;

import java.util.Arrays;

public class NextGreaterElement1_496 {

    public static boolean isGreater(int n) {



        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] ans = new int[nums1.length];
        int i = 0;

        for (int n1 : nums1) {
            int n = -1;

            for (int j = 0; j < nums2.length; j++) {
                int n2 = nums2[j];

                if (n1 == n2) {

                    for (int k = j; k < nums2.length; k++) {
                        if (n1 < nums2[k]) {
                            n = nums2[k];
                            break;
                        }
                    }
                }
            }

            ans[i] = n;
            i++;
        }

        System.out.println(Arrays.toString(ans));

    }

}
