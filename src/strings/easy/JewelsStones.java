package strings.easy;

import java.util.Arrays;

public class JewelsStones {

    public static void main(String[] args) {

//        String jewels = "aA";
//        String stones = "aAAbbbb";

        String jewels = "bcd";
        String stones = "cba";

//        String jewels = "z";
//        String stones = "ZZ";

        char[] s = stones.toCharArray();
        char[] j = jewels.toCharArray();
        Arrays.sort(s);
        Arrays.sort(j);

        int count = 0;
        int k = 0;
        char ss = j[0];

        for (int i = 0; i < stones.length(); i++){
            char cs = s[i];

            if (ss == cs){
                count++;
            } else {
                k++;
                if (k < j.length){
                    ss = j[k];
                }
                if (ss == cs){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
