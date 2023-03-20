package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2341_Maximum_Number_Pairs {

    public static int[] numberOfPairs(int[] nums) {
        int[] answer = {0,1};

        int countPairs = 0;
        int leftNum = 0;

        if (nums.length < 2)
            return answer;

        Map<Integer,Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            countPairs += (entry.getValue() / 2);
            map.put(entry.getKey(), (entry.getValue() % 2));
            leftNum += entry.getValue();
        }
        answer[0] = countPairs;
        answer[1] = leftNum;

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,2,1,3,2,2};

        System.out.println(Arrays.toString(numberOfPairs(nums)));

    }

}
