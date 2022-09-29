package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2418_Sort_The_People {


    public static void main(String[] args) {

        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};

        Map<Integer, String> map = new HashMap<>();

        int i = 0;

        for (int height : heights) {
            map.put(height,names[i++]);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Height " + entry.getKey() + "  Name " + entry.getValue());
        }

        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));

        String[] answer = new String[names.length];
        int index = 0;
        for (i = names.length-1; i >= 0 ; i--) {
            answer[index++] = map.get(heights[i]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
