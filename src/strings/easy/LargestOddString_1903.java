package strings.easy;

public class LargestOddString_1903 {

    public static String largestOddNumber(String num) {

        for (int i = num.length()-1; i >= 0; i--){
            if (Integer.parseInt(""+num.charAt(i)) % 2 == 1)
                return num.substring(0,i+1);
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("523"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(largestOddNumber("0"));
        System.out.println(largestOddNumber("111111111"));
    }
}
