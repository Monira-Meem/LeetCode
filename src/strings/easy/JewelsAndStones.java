package strings.easy;

import java.util.Arrays;

public class JewelsAndStones {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
//        String jewels = "bcd";
//        String stones = "cba";
//        String jewels = "z";
//        String stones = "ZZ";

        int[] sCounts = new int[52];
        int[] jCounts = new int[52];
        int count = 0;

        for (int i = 0; i < stones.length(); i++){
            char s = stones.charAt(i);
            int sInd;
            if (s >= 'a' && s <= 'z'){
                sInd = s - 'a' +26;
            } else {
                sInd = s - 'A';
            }
            sCounts[sInd]++;
        }

        for (int i = 0; i < jewels.length(); i++){
            char j = jewels.charAt(i);
            int jInd;
            if (j >= 'a' && j <= 'z'){
                jInd = j - 'a' +26;
            } else {
                jInd = j - 'A';
            }
            jCounts[jInd]++;

        }
        System.out.println(Arrays.toString(sCounts));
        System.out.println(Arrays.toString(jCounts));

        for (int i = 0; i < 52; i++){
            if (sCounts[i] >= 1  && jCounts[i] >= 1){
                count += sCounts[i];
            }
        }
        System.out.println(count);
    }
}
