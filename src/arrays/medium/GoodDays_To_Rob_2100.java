package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class GoodDays_To_Rob_2100 {

    public static void main(String[] args) {

        int[] security = {5,3,3,3,5,6,2};
        int time = 2;

        int n = security.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++){
            if (security[i] > security[i-1])
                left[i] = 0;
            else
                left[i] = left[i-1]+1;
        }

        for (int i = n -2; i >= 0; i--){
            if (security[i] > security[i+1])
                right[i] = 0;
            else
                right[i] = right[i+1] +1;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = time; i < n; i++){
            if (left[i] >= time && right[i] >= time)
                list.add(i);
        }

    }
}
