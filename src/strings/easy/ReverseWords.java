package strings.easy;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";  // "s'teL ekat edoCteeL tsetnoc"

        String newString = "";

        String[] sArray = s.split(" ");

        for (int i = 0; i < sArray.length; i++){
            String s1 = sArray[i];

            char[] chars = s1.toCharArray();
            int x = s1.length()-1;

            for (int j = 0; j < s1.length()/2; j++){
                char ch = chars[j];
                chars[j] = chars[x];
                chars[x] = ch;
                x--;
            }
            s1 = String.valueOf(chars);
            sArray[i] = s1;
        }
       String temp = "";

        for (int i = 0; i < sArray.length-1; i++){
            temp += sArray[i] + " ";
        }
        newString = temp + sArray[sArray.length-1];

        System.out.println(Arrays.toString(sArray));
        System.out.println(newString);
//        System.out.println(sb);
    }
}
