package strings.easy;

public class JewelsStones2 {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

//        String jewels = "bcd";
//        String stones = "cba";

//        String jewels = "z";
//        String stones = "ZZ";

        int count = 0;

        for (int i = 0; i < stones.length(); i++){
            char s = stones.charAt(i);
            String ss = Character.toString(s);

            if (jewels.contains(ss)){
                count++;
            }
        }
        System.out.println(count);
    }
}
