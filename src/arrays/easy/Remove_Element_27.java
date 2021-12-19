package arrays.easy;

public class Remove_Element_27 {

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int i = 0;
        for (int n : nums) {
            if (n != val){
                nums[i] = n;
                i++;
            }
        }

        System.out.println(nums.length-i);

    }

}
