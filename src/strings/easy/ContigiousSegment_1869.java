package strings.easy;

public class ContigiousSegment_1869 {

    public static void main(String[] args) {

        String s = "110100010";

        int count1 = 0;
        int count0 = 0;

        int max1 = 0;
        int max0 = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                count1++;
                count0 = 0;
            }
            else{
                count0++;
                count1 = 0;
            }
            if (count1 > max1)
                max1 = count1;
            if (count0 > max0)
                max0 = count0;
        }

        System.out.println(max0);
        System.out.println(max1);

    }
}
