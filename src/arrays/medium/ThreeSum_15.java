package arrays.medium;

import java.util.*;

public class ThreeSum_15 {

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();

        HashSet<List<Integer>> ans = new HashSet<>();

        if (nums.length < 3){
            return new ArrayList(ans);
        } else {
            Arrays.sort(nums);

            for (int i = 0; i < nums.length -2; i++){
                int l = i +1;
                int r = nums.length-1;

                while (l < r ){

                    int sum = nums[i] + nums[l] + nums[r];

                    if (sum < 0){
                        l++;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        ans.add(Arrays.asList(nums[i],nums[l],nums[r]));

                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> threeSum2(int[] nums){
        int targetSum = 0;
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < length-2; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;
            int right = length-1;

            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == targetSum){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                } else if (currentSum < targetSum){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }

}
