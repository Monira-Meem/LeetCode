package arrays.easy;

public class Remove_Duplicate_SortedArray_26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = 0;

        for (int i = 1; i < nums.length; i++){

            if (nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(k);
    }
}
