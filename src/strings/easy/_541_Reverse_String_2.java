package strings.easy;

import java.util.Arrays;

public class _541_Reverse_String_2 {

    public static void reverse(char[] arr, int left, int right) {

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 2;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2*k) {
            int left = i;
            int right = Math.min(i + k-1, arr.length -1);

            reverse(arr,left,right);
        }
        System.out.println(Arrays.toString(arr));
    }
}
