package arrays.medium;

public class Search_2D_Matrix2_240 {

    public static boolean binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;

        while (l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target)
                r = mid -1;
            else
                l = mid+1;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 2;

        for (int[] nn : nums){
            System.out.println(binarySearch(nn,target));
        }

    }

}
