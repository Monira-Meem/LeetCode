package practice;

import java.util.Arrays;

public class UniChar {

    public static void main(String[] args) {

//        String s = "abc";
//        String s = "monira";
//        String s = "meem";
        String s = "asdkkkfg";
        char[] chars = s.toCharArray();
        boolean isUnique = true;

//        int last = s.length()-1;
//        int first = 0;
//
//        while (first < last){
//            if (s.charAt(first) != s.charAt(last)){
//                isUnique = true;
//            } else {
//                isUnique = false;
//            }
//            last--;
//            first++;
//        }

        for (int i = 0; i <= chars.length-1; i++){
            char c = chars[i];
            if (c== chars[i+1]){
                isUnique = false;
                break;
            }
        }

        System.out.println(isUnique);
    }
}
