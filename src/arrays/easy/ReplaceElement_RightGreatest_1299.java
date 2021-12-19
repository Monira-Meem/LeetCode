package arrays.easy;

import java.util.Arrays;

public class ReplaceElement_RightGreatest_1299 {

    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = -1;
        for (int i = arr.length-1; i >= 0; i--){
            int num = arr[i];
            ans[i] = max;
            max = Math.max(num,max);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {400};
        int[] ans = new int[arr.length]; // 18,6,6,6,1,-1

        int max = -1;
        for (int i = arr.length-1; i >= 0; i--){
            int num = arr[i];
            ans[i] = max;
            max = Math.max(num,max);
        }

        System.out.println(Arrays.toString(ans));
    }
}
