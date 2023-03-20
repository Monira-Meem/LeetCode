package arrays.easy;

public class _2529_Max_Count_Pos_And_Neg_Integer {

    public static int maximumCount(int[] nums) {

        int pos = 0;
        int neg = 0;

        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos,neg);
    }

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[] {-3,-2,-1,0,0,1,2}));
    }
}
