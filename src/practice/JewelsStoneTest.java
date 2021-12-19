package practice;

import java.util.Arrays;

public class JewelsStoneTest {

    public static void main(String[] args) {

//        String jewels = "bcd";
//        String stones = "bca";
//        String jewels = "aA";
//        String stones = "aAAbbbb";
        String jewels = "z";
        String stones = "ZZ";

        int[] counts = new int[52];
        int count= 0;

        for (char s : stones.toCharArray()){
            if (jewels.indexOf(s) != -1){
                count++;
            }
        }
        System.out.println(count);

    }
}
