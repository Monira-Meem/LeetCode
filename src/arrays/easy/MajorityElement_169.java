package arrays.easy;

public class MajorityElement_169 {
    public  int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                num = nums[i];
            }
            if (nums[i] == num){
                count++;
            } else {
                count--;
            }
        }
        return num;
    }

    public static void main(String[] args) {

//        int[] nums = {2,2,1,1,1,2,2};
//        int[] nums = {2,3,3,2};
        int[] nums = {1,1,1,1,3,3,3,3,4,5,4,4,4,5,4,5,6,6,4,4};
        int num = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++){

            if (count == 0){
                num = nums[i];
            }
            if (nums[i] == num){
                count++;
            } else {
                count--;
            }
        }
        System.out.println(num);
    }
}
