package arrays.easy;

public class EvenDigitNumber {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums){
            String s = Integer.toString(n);
            if (s.length() % 2 == 0)
                count++;
        }
        return count;
    }
}
