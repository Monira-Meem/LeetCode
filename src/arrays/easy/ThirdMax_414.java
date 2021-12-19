package arrays.easy;

public class ThirdMax_414 {

    public static void main(String[] args) {

        int[] nums = {1,2,-2147483648};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : nums){

            if (num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2 && num != max1){
                max3 = max2;
                max2 = num;
            } else if (max3 < num && num != max2 && num != max1){
                max3 = num;
            }
        }

        if (max3 > Integer.MIN_VALUE)
            System.out.println(max3);
        else
            System.out.println(max1);

    }
}
