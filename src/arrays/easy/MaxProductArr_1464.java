package arrays.easy;

public class MaxProductArr_1464 {

    public int maxProduct(int[] nums) {

        int f_max = Integer.MIN_VALUE, s_max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > f_max) {
                s_max = f_max;
                f_max = num;
            } else if (num > s_max) {
                s_max = num;
            }
        }

        return (f_max-1)*(s_max-1);
    }

    public static void main(String[] args) {

        int[] nums = {3,7};
        int product = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i <nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                product = (nums[i] -1) * (nums[j]-1);

                if (max < product)
                    max = product;
            }
        }

        System.out.println(max);
    }
}
