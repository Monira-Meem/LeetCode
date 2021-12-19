package strings.easy;

public class MaxConsecutiveOnes_485 {

    public static void main(String[] args) {

        int[] nums = {1,0,1,1,0,1};
        int count = 0;
        int max = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
            } else
                count = 0;

            if (count > max)
                max = count;
        }
        System.out.println(max);

    }
}
