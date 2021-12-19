package arrays.easy;

import java.util.Arrays;

public class Unique_Int_Sum_Zero_1304 {

    public static void main(String[] args) {

        int n = 1;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            ans[i] = i+1;
            ans[n-1-i] = (-1)*(i+1);
        }
        if (n % 2 == 1){
            ans[n/2] = 0;
        }
//        int sum = 0;
//        for (int a : ans){
//            sum += a;
//            System.out.println(sum);
//        }

        System.out.println(Arrays.toString(ans));
    }
}
