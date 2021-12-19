package arrays.easy;

import java.util.Arrays;

public class DecodeXORedArray {

//    int[] en=new int[e.length+1];
//    en[0]=f;
//    int j=1;
//        for(int i=0;i<e.length;i++)
//    {
//        en[j]=e[i]^en[j-1];
//        j++;
//    }
//        return en;

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        int j = 1;
        for (int k : encoded) {
            arr[j] = k ^ arr[j - 1];
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] nums2 = {6,2,7,3};
        System.out.println(Arrays.toString(decode(nums,1)));
        System.out.println(Arrays.toString(decode(nums2,4)));
    }
}
