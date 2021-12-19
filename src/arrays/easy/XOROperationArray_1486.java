package arrays.easy;

public class XOROperationArray_1486 {

    public static int xorOperation(int n, int start) {
        int xor = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = start + (2 *i);
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
        System.out.println(xorOperation(4,3));
        System.out.println(xorOperation(1,7));
    }
}
