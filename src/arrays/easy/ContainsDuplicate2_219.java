package arrays.easy;

import java.util.HashMap;

public class ContainsDuplicate2_219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

       // int i = 0;
        int j = nums.length -1;

//        while (i <= j) {
//
//            if (nums[i] == nums[j]) {
//                if (Math.abs(i - j) == k) {
//                    return true;
//                }
//            }
//            j--;
//            i++;
//
//        }

//        for (int x = 0; x < nums.length; x++) {
//            for (int y = 0; y < nums.length; y++) {
//                if (nums[x] == nums[y] && x != y) {
//                    if (Math.abs(x-y) <= k) {
//                        return true;
//                    }
//                }
//            }
//        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (map.containsKey(num) && Math.abs(map.get(num) - i) <= k) {
                return true;
            } else {
                map.put(num, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,0,1,1};
        int k = 1;

        System.out.println(containsNearbyDuplicate(nums,k));


    }
}
